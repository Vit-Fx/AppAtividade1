package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.widget.TextView;

public class AtividadePg2 extends AppCompatActivity {

    TextView textViewNomeUsu, textViewAcima, textViewAbaixo, textViewDentro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_pg2);

        textViewNomeUsu = findViewById(R.id.textViewNomeUsu);
        textViewAcima = findViewById(R.id.textViewAcima);
        textViewAbaixo = findViewById(R.id.textViewAbaixo);
        textViewDentro = findViewById(R.id.textViewDentro);

        textViewNomeUsu.setText(Util.Nome);

        if(Util.IMC>26){
            textViewAcima.setBackgroundColor(Color.parseColor("#F1D355"));
        }
        else if(Util.IMC<18){
            textViewAbaixo.setBackgroundColor(Color.parseColor("#33E3FF"));
        }
        else{
            textViewDentro.setBackgroundColor(Color.parseColor("#D496D8"));
        }
    }
}