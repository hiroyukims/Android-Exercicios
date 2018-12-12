package com.example.nhmatsumoto.exercicios.provas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.nhmatsumoto.exercicios.R;
import com.example.nhmatsumoto.exercicios.provas.crud.CadastroAluno;

import java.util.ArrayList;
import java.util.List;

public class CrudAcademico extends AppCompatActivity {


    protected  Button btnMenuNovoAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_academico);
        getSupportActionBar().setTitle("CRUD");
        
        btnMenuNovoAluno = (Button)findViewById(R.id.btnMenuNovoAluno);

        ListView listaCrudAcademico = (ListView) findViewById(R.id.listaCrudAcademico);
        List<String> alunos = new ArrayList<String>();

        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alunos);
        listaCrudAcademico.setAdapter(adapter);



        btnMenuNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastroAluno = new Intent(getBaseContext(), CadastroAluno.class);
                startActivity(cadastroAluno);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_academico, menu);
        return true;
    }




}
