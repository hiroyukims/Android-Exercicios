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

    protected Button btnMostrarDados;
    protected CheckBox ckBoxDEV;
    protected CheckBox ckBoxINFRA;
    protected CheckBox ckBoxGESTAO;
    protected Spinner dropTempoExperiencia;
    protected RadioGroup radioGroup;
    protected EditText txtNome;
    protected EditText txtTelefone;
    protected EditText txtCpf;
    protected TextView txtViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);
        getSupportActionBar().setTitle("Exercício 03");


        ckBoxDEV = (CheckBox) findViewById(R.id.checkDev);
        ckBoxINFRA = (CheckBox) findViewById(R.id.checkInfra);
        ckBoxGESTAO = (CheckBox) findViewById(R.id.checkGestao);
        dropTempoExperiencia = findViewById(R.id.dropTempoExperiencia);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        txtNome = (EditText) findViewById(R.id.editTextNome);
        txtTelefone = (EditText) findViewById(R.id.editTextTelefone);
        txtCpf = (EditText) findViewById(R.id.editTextCpf);
        btnMostrarDados = (Button) findViewById(R.id.btnMostrarDados);

        //Dropdown
        String[] items = new String[]{"1 ano", "Até 3 anos", "Até 6 anos"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropTempoExperiencia.setAdapter(adapter);


        btnMostrarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String nome = txtNome.getText().toString();
                String telefone = txtTelefone.getText().toString();
                String cpf = txtCpf.getText().toString();

                String experiencia = dropTempoExperiencia.getSelectedItem().toString();

                txtViewResultado.setText(nome + telefone + cpf+ experiencia);
            }
        });




    }
}
