package com.example.nhmatsumoto.exercicios.provas.crud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.nhmatsumoto.exercicios.R;

public class CadastroAluno extends AppCompatActivity {

    protected Spinner dropCursos;
    protected EditText txtNome;
    protected EditText txtEmail;
    protected EditText txtRu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        dropCursos = (Spinner) findViewById(R.id.dropCurso);
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtRu = (EditText) findViewById(R.id.txtRu);


        //Dropdown
        String[] items = new String[]{"1 ano", "Até 3 anos", "Até 6 anos"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropCursos.setAdapter(adapter);



    }
}
