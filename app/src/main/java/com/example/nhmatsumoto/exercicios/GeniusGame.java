package com.example.nhmatsumoto.exercicios;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import java.util.Arrays;
import java.util.List;

public class GeniusGame extends AppCompatActivity {

    protected  Button btn1 = (Button) findViewById(R.id.btn1);
    protected  Button btn2 = (Button) findViewById(R.id.btn2);
    protected  Button btn3 = (Button) findViewById(R.id.btn3);
    protected  Button btn4 = (Button) findViewById(R.id.btn4);

    private List<Button> changeBtnColorList;

    List<Button> listaBotao;
    Button btnContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genius_game);

        final Button btnStart = (Button) findViewById(R.id.btnStartGame);

        //Qquando clicar aqui, iniciar sequencia da fase em questão
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        piscaBotaoX(1);

                        //buttonColor.getBotao().setBackgroundColor(Color.parseColor("#BBBBBB"));
                    }
                }, 300);


            }
        });


    }







    //Devolve a sequencia da fase em questão
    public int[] getFase(int fase) {

       int[] faseArray = new int[0];

        switch (fase) {
            case 1:
                faseArray = new int[]{1, 2, 3, 4, 1, 2, 3, 4};
            break;
            case 2:
                faseArray = new int[]{1, 3, 1, 3, 1, 3, 1, 3};
            break;
            case 3:
                faseArray = new int[]{4, 1, 1, 2, 3, 3, 3, 1};
            break;
            case 4:
                faseArray = new int[]{1, 2, 3, 4, 1, 2, 3, 4};
            break;
            case 5:
                faseArray = new int[]{4, 3, 2, 1, 1, 2, 3, 4};
            break;
        }

        return  faseArray;
    }

    public void piscaBotaoX(int fase){

        listaBotao = Arrays.asList(
                btn1,
                btn2,
                btn3,
                btn4
        );

        int[] playFase = getFase(fase);

        for(int i = 0; i <= listaBotao.size(); i++) {

            for(int j = 0; j <= playFase.length; i++) {

                btnContext = listaBotao.get(i);
                switch (playFase[j]){
                    case 1:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                btnContext.setBackgroundColor(Color.RED);
                            }
                        }, 300);

                     break;
                    case 2:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                btnContext.setBackgroundColor(Color.GREEN);
                            }
                        }, 300);

                    break;
                    case 3:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                btnContext.setBackgroundColor(Color.YELLOW);
                            }
                        }, 300);

                    break;
                    case 4:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                btnContext.setBackgroundColor(Color.BLUE);
                            }
                        }, 300);

                    break;
                }
            }
        }


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_genius, menu);
        return true;
    }
}
