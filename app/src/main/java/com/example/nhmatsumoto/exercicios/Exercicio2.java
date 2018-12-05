package com.example.nhmatsumoto.exercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);


        final EditText Nome = (EditText) findViewById(R.id.editTextNome);
        final EditText Ru = (EditText) findViewById(R.id.editTextRu);
        final EditText Curso = (EditText) findViewById(R.id.editTextCurso);



        Button btnEnvia = (Button) findViewById(R.id.btnEnvia);
        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String dataEnvia = Nome.getText().toString() +", "+ Ru.getText().toString() +", "+ Curso.getText().toString();
                bundle.putString("informacao", dataEnvia);
                Intent intent = new Intent(getBaseContext(), Exercicio2_pagina2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
