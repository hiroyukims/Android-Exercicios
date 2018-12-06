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

    CheckBox ckBoxDEV = (CheckBox) findViewById(R.id.checkDev);
    CheckBox ckBoxINFRA = (CheckBox) findViewById(R.id.checkInfra);
    CheckBox ckBoxGESTAO = (CheckBox) findViewById(R.id.checkGestao);
    Spinner dropdown = findViewById(R.id.dropTempoExperiencia);
    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    //Instãncias dos EditText's
    EditText nome = (EditText) findViewById(R.id.editTextNome);
    EditText telefone = (EditText) findViewById(R.id.editTextTelefone);
    EditText cpf = (EditText) findViewById(R.id.editTextCpf);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        //Dropdown
        String[] items = new String[]{"1 ano", "Até 3 anos", "Até 6 anos"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        /*
        String concatenaValorSpinner = dropdown.getSelectedItem().toString();
        String concatenaEditText = nome.getText() + ", " + telefone.getText() + ", " + cpf.getText();
        String concatenaCheckBox = ckBoxDEV.getText() + ", " + ckBoxINFRA.getText() + ", " + ckBoxGESTAO.getText();
        //Radio Button
        int radioSelecionado = radioGroup.getCheckedRadioButtonId();
        RadioButton rdBtn = (RadioButton) findViewById(radioSelecionado);
        String concatenaRadioButtonSeleciona = rdBtn.getText().toString();

        final String r = concatenaEditText + ", " + concatenaRadioButtonSeleciona + ", " + concatenaCheckBox + ", " + concatenaValorSpinner;
        final TextView txtResultado = (TextView) findViewById(R.id.txtViewResultado);
        */
        
        Button btnMostrarDados = (Button) findViewById(R.id.btnMostrarDados);
        btnMostrarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //txtResultado.setText(r);

            }
        });



    }
}
