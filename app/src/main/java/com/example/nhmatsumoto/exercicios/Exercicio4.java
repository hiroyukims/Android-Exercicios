package com.example.nhmatsumoto.exercicios;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Exercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);


        Spinner dropdown = findViewById(R.id.dropProfissao);

        String[] items = new String[]{"Aluno", "Professor", "Coordenador", "Analista"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


        String text = ((Spinner)findViewById(R.id.dropProfissao)).getSelectedItem().toString();

        final EditText nome = (EditText) findViewById(R.id.txtNome);
        final EditText Ru = (EditText) findViewById(R.id.txtRu);
        final Spinner dropProfissao = (Spinner) findViewById(R.id.dropProfissao);




        final String resultado =  nome.getText() + ", " + Ru.getText() + ", " + text;

        Button btnMostrar = (Button) findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, resultado, duration);
                toast.show();
            }
        });

    }





}
