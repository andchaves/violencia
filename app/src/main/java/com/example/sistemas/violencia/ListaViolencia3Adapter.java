package com.example.sistemas.violencia;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sistemas.violencia.models.Violencia;

import java.util.ArrayList;

public class ListaViolencia3Adapter extends RecyclerView.Adapter<ListaViolencia3Adapter.ViewHolder> {

    private ArrayList<Violencia> dataset;
    private Context context;

    public ListaViolencia3Adapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lista_violencia3_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        boolean encontro=false;
        for (int i=1; i<=dataset.size() && encontro==false ; i++ )

        {

            Violencia p = dataset.get(i);
            if (dataset.get(i).getGrupoDeEdad().equals("(18 a 19)")) {
                holder.casoshom.setText("Casos Hombre: " + p.getHombre());
                holder.porhom.setText("%: " + p.getHomre());
                holder.casosmu.setText("Casos Mujer: " + p.getMujer1());
                holder.pormu.setText("%: " + p.getMujer2());
                encontro = true;
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaViolencia(ArrayList<Violencia> listaVotac) {
        dataset.addAll(listaVotac);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView casoshom;
        private TextView porhom;
        private TextView casosmu;
        private TextView pormu;

        public ViewHolder(View itemView) {
            super(itemView);
            casoshom = (TextView) itemView.findViewById(R.id.casoshombre);
            porhom =(TextView) itemView.findViewById(R.id.porhombre);

            casosmu = (TextView) itemView.findViewById(R.id.casosmujer);
            pormu =(TextView) itemView.findViewById(R.id.pormujer);

        }
    }
}