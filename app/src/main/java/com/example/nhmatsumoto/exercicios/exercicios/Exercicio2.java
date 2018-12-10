package com.example.nhmatsumoto.exercicios.exercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nhmatsumoto.exercicios.R;

public class Exercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);
        getSupportActionBar().setTitle("Exercício 02");

        final EditText Nome = (EditText) findViewById(R.id.editTextNome);
        final EditText Ru = (EditText) findViewById(R.id.editTextRu);
        final EditText Curso = (EditText) findViewById(R.id.editTextCurso);



        Button btnEnvia = (Button) findViewById(R.id.btnEnvia);
        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cria instãncia de bundle
                Bundle bundle = new Bundle();

                //Cria variável tipo String e atribuí valores que vão ser enviados (vindos dos inputs na tela do usuário)
                String dataEnvia = Nome.getText().toString() +", "+ Ru.getText().toString() +", "+ Curso.getText().toString();

                //Seta identificador no blandle
                bundle.putString("informacao", dataEnvia);

                //cria instância de Indent para chamar tela 02 do exercício 02
                Intent intent = new Intent(getBaseContext(), Exercicio2_pagina2.class);
                intent.putExtras(bundle);
                //Chama tela 02
                startActivity(intent);

            }
        });

    }
}
