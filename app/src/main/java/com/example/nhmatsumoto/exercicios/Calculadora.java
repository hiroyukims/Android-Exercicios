package com.example.nhmatsumoto.exercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        getSupportActionBar().setTitle("Calculadora");


        //Botões de operações

        Button btnAdicao = (Button) findViewById(R.id.btnAdicao);
        Button btnSubmetracao = (Button) findViewById(R.id.btnSubtracao);
        Button btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);
        Button btnDivisao = (Button) findViewById(R.id.btnDivisao);
        Button btnRaiz = (Button) findViewById(R.id.btnRaiz);
        Button btnExp = (Button) findViewById(R.id.btnExp);
        Button btnPonto = (Button) findViewById(R.id.btnPonto);
        Button btnIgual = (Button) findViewById(R.id.btnIgual);
        Button btnC = (Button) findViewById(R.id.btnC);

        //Botões núméricos
        Button btnZero = (Button) findViewById(R.id.btn0);
        Button btnUm = (Button) findViewById(R.id.btn1);
        Button btnDois = (Button) findViewById(R.id.btn2);
        Button btnTres = (Button) findViewById(R.id.btn3);
        Button btnQuatro = (Button) findViewById(R.id.btn4);
        Button btnCinco = (Button) findViewById(R.id.btn5);
        Button btnSeis = (Button) findViewById(R.id.btn6);
        Button btnSete = (Button) findViewById(R.id.btn7);
        Button btnOito = (Button) findViewById(R.id.btn8);
        Button btnNove = (Button) findViewById(R.id.btn9);







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_calculadora, menu);
        return true;
    }




}
