package com.example.nhmatsumoto.exercicios.exercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nhmatsumoto.exercicios.R;

public class Exercicio2_pagina2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2_pagina2);
        getSupportActionBar().setTitle("Exercício 02 página 02");
        Bundle extras = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.txtViewTela2);


        String dataRecebido;
        if(extras != null) {
            dataRecebido = extras.getString("informacao");
            textView.setText(dataRecebido);
        }



    }


}
