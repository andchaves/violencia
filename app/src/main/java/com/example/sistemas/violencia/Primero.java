package com.example.sistemas.violencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.sistemas.violencia.models.Violencia;
import com.example.sistemas.violencia.vioapi.VioapiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Primero extends AppCompatActivity {

    //crear el objeto de tipo retrofit
    private static final String TAG = "VIOLENCIA";
    private Retrofit retrofit;
    //instancia para RecyclerView
    private RecyclerView recyclerView;
    private ListaViolenciaAdapter listaViolenciaAdapter;

    //variable offset incializada en 0 para la primera vez que se carga;
    private int offset;

    //variable para controlar y permitir una sola ejecucion cuando se llegue al final
    private boolean aptoParaCargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);

        recyclerView = (RecyclerView) findViewById(R.id.rv_lista);
        listaViolenciaAdapter = new ListaViolenciaAdapter(this);
        recyclerView.setAdapter(listaViolenciaAdapter);
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);

        //para reconocer cuando se llega al final de un RecyclerView
        //escucha cuando detecta un movimiento de scroll
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                    if (aptoParaCargar) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, "Llegamos al final.");
                            aptoParaCargar = false;

                            obtenerListaViolencia();
                        }
                    }
                }
            }
        });

        //la ruta base de la url del web service
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //para nueva consulta a la API
        aptoParaCargar = true;
        offset = 0;
        obtenerListaViolencia();

    }


    private void obtenerListaViolencia() {
        VioapiService service = retrofit.create(VioapiService.class);
        Call<ArrayList<Violencia>> acueductoRespuestaCall = service.obtenerListaViolencia();

        acueductoRespuestaCall.enqueue(new Callback<ArrayList<Violencia>>() {
            @Override
            public void onResponse(Call<ArrayList<Violencia>> call, Response<ArrayList<Violencia>> response) {
                if(response.isSuccessful()){
                    ArrayList lista = response.body();
                    listaViolenciaAdapter.adicionarListaViolencia(lista);
                }
                else
                {
                    Log.e(TAG, "onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Violencia>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }
        });

    }
}
