package com.example.nhmatsumoto.exercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Exercicio1 extends AppCompatActivity {


    //Pratica 1, exercicios


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);
        getSupportActionBar().setTitle("Exercício 01");

        Button btnRegistrar = (Button) findViewById(R.id.btnRegistrar);

        final TextView resultado = (TextView) findViewById(R.id.txtResultado);

        final EditText nome = (EditText) findViewById(R.id.editTextNome);
        final EditText endereco = (EditText) findViewById(R.id.editTextEndereco);
        final EditText telefone = (EditText) findViewById(R.id.editTextTelefone);



        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultadoConcatenado = nome.getText() + ", " + endereco.getText() + ", " + telefone.getText();
                resultado.setText(resultadoConcatenado);
            }
        });


    }
}
