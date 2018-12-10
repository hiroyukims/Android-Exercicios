package com.example.nhmatsumoto.exercicios.provas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nhmatsumoto.exercicios.R;

import java.util.ArrayList;
import java.util.List;

public class CrudAcademico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_academico);
        getSupportActionBar().setTitle("CRUD");


        ListView listaCrudAcademico = (ListView) findViewById(R.id.listaCrudAcademico);
        List<String> alunos = new ArrayList<String>();

        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alunos);
        listaCrudAcademico.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_academico, menu);
        return true;
    }




}
