package com.example.nhmatsumoto.exercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Genius extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genius);
        getSupportActionBar().setTitle("Genius");

        Button btnJogar = (Button) findViewById(R.id.btnGeniusJogar);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IndentJogar = new Intent(getBaseContext(), GeniusGame.class);
                startActivity(IndentJogar);
            }
        });


        Button btnSobre = (Button) findViewById(R.id.btnGeniusSobre);
        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IndentSobre = new Intent(getBaseContext(), GeniusAluno.class);
                startActivity(IndentSobre);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_genius, menu);
        return true;
    }


}
