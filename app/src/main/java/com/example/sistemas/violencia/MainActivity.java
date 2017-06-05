package com.example.sistemas.violencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner lista;
    private String[] datos={"Elige un grupo de edad","10 a 14","15 a 17","18 a 19","20 a 24","25 a 29","20 a 24"};

    View boton;
    RadioGroup rg;
    int checa;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rg =(RadioGroup) findViewById(R.id.rg);
        boton = (View) findViewById(R.id.btnir);
        boton.setOnClickListener(this);



    }



    @Override
    public  void onClick(View v)
    {
        String msj="";
        checa=rg.getCheckedRadioButtonId();
        switch (checa)
        {
            case R.id.radio1: msj = "10 a 14";
                if (checa == R.id.radio1)
                {
                Intent i = new Intent(this, Primero.class);
                startActivity(i);

        }
                //Toast.makeText(this, "10 a 14",Toast.LENGTH_SHORT).show();

            case R.id.radio2: msj="15 a 17";

                if(checa == R.id.radio2)
                {
                    Intent in = new Intent(this, Segundo.class);
                    startActivity(in);
                }

            case R.id.radio3: msj="15 a 17";

                if(checa == R.id.radio3)
                {
                    Intent in = new Intent(this, Tercero.class);
                    startActivity(in);
                }

            case R.id.radio4: msj="15 a 17";

                if(checa == R.id.radio4)
                {
                    Intent in = new Intent(this,Cuarto.class);
                    startActivity(in);
                }
            case R.id.radio5: msj="15 a 17";

                if(checa == R.id.radio5)
                {
                    Intent in = new Intent(this, Quinto.class);
                    startActivity(in);
                }
            case R.id.radio6: msj="15 a 17";

                if(checa == R.id.radio6)
                {
                    Intent in = new Intent(this, Sexto.class);
                    startActivity(in);
                }
            case R.id.radio7: msj="15 a 17";

                if(checa == R.id.radio7)
                {
                    Intent in = new Intent(this, Septimo.class);
                    startActivity(in);
                }
            case R.id.radio8: msj="15 a 17";

                if(checa == R.id.radio8)
                {
                    Intent in = new Intent(this, Octavo.class);
                    startActivity(in);
                }
            case R.id.radio9: msj="15 a 17";

                if(checa == R.id.radio9)
                {
                    Intent in = new Intent(this, Noveno.class);
                    startActivity(in);
                }






        }


    }

    //public void ver(View v) {
    //    Intent i = new Intent(this, Primero.class);
     //   startActivity(i);
    //}
}



