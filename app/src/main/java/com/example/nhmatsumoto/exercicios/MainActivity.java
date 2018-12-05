package com.example.nhmatsumoto.exercicios;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
