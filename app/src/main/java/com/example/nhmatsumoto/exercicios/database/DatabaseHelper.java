package com.example.nhmatsumoto.exercicios.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    //Nome do banco de dados
    static final String DBNAME = "dbAcademico";
    //Nome da tabela
    static final String TABELA_ALUNO = "aluno";

    //Colunas da tabela
    static final String COL_ID = "id";
    static final String COL_NOME = "nome";
    static final String COL_RU = "ru";
    static final String COL_EMAIL = "email";

    static final int DBVERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + TABELA_ALUNO + " (" + COL_ID + " INTEGER PRIMARY KEY , " + COL_NOME + " TEXT, " + COL_RU + " TEXT, "+ COL_EMAIL +" TEXT); "
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA_ALUNO);
    }
}
