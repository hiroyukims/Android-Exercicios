package com.example.nhmatsumoto.exercicios;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Exercicio3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);
        getSupportActionBar().setTitle("Exercício 03");


        CheckBox ckBoxDEV = (CheckBox) findViewById(R.id.checkDev);
        CheckBox ckBoxINFRA = (CheckBox) findViewById(R.id.checkInfra);
        CheckBox ckBoxGESTAO = (CheckBox) findViewById(R.id.checkGestao);
        Spinner dropdown = findViewById(R.id.dropTempoExperiencia);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        EditText nome = (EditText) findViewById(R.id.editTextNome);
        EditText telefone = (EditText) findViewById(R.id.editTextTelefone);
        EditText cpf = (EditText) findViewById(R.id.editTextCpf);


        //Dropdown
        String[] items = new String[]{"1 ano", "Até 3 anos", "Até 6 anos"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);



    }
}
