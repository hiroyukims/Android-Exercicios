package com.example.nhmatsumoto.exercicios;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaExercicios = (ListView) findViewById(R.id.listaExercicios);



        List<String> exercicios = new ArrayList<String>();
        exercicios.add("Exercício 1");
        exercicios.add("Exercício 2");
        exercicios.add("Exercício 3");
        exercicios.add("Exercício 4");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, exercicios);
        listaExercicios.setAdapter(adapter);



        listaExercicios.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position + 1) {
                    case 0:
                        Intent paginaExercicio1 = new Intent(getBaseContext(), Exercicio1.class);
                        paginaExercicio1 = new Intent(getBaseContext(), Exercicio1.class);
                    break;
                    case 1:
                        Intent paginaExercicio2 = new Intent(getBaseContext(), Exercicio2.class);
                        startActivity(paginaExercicio2);
                    break;
                    case 2:
                        Intent paginaExercicio3 = new Intent(getBaseContext(), Exercicio3.class);
                        startActivity(paginaExercicio3);
                    break;
                    case 3:
                        Intent paginaExercicio4 = new Intent(getBaseContext(), Exercicio4.class);
                        startActivity(paginaExercicio4);
                    break;

                }


            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.exercicio1:
                Intent paginaExercicio1 = new Intent(getBaseContext(), Exercicio1.class);
                startActivity(paginaExercicio1);
                return true;

            case R.id.exercicio2:

                Intent paginaExercicio2 = new Intent(getBaseContext(), Exercicio2.class);
                startActivity(paginaExercicio2);
                return true;

            case R.id.exercicio3:

                Intent paginaExercicio3 = new Intent(getBaseContext(), Exercicio3.class);
                startActivity(paginaExercicio3);
                return true;

            case R.id.exercicio4:

                Intent paginaExercicio4 = new Intent(getBaseContext(), Exercicio4.class);
                startActivity(paginaExercicio4);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }



}
