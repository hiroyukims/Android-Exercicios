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

    protected  EditText textNome;
    protected  EditText textRu;
    protected  Spinner dropDownProfissao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);
        getSupportActionBar().setTitle("Exercício 04");


        textNome = (EditText) findViewById(R.id.txtNome);
        textRu = (EditText) findViewById(R.id.txtRu);
        dropDownProfissao = (Spinner) findViewById(R.id.dropProfissao);


        //Seta lista de prossiões
        String[] items = new String[]{"Aluno", "Professor", "Coordenador", "Analista"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropDownProfissao.setAdapter(adapter);


        Button btnMostrar = (Button) findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                String nome = textNome.getText().toString();
                String ru = textRu.getText().toString();
                String profissao = dropDownProfissao.getSelectedItem().toString();

                Toast toast = Toast.makeText(context, nome+", " + ru +", "+profissao, duration);
                toast.show();
            }
        });

    }





}
