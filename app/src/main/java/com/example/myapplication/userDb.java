package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class userDb extends SQLiteOpenHelper {

    private Context context;

    private static final  String DATABSE_NAME = "EcoBack.db";
    private static final  int DATABASE_VERSION = 1;
    private static final  String TABLE_NAME = "userDb";
    private static final  String COLUMN_ID = "_ID";
    private static final  String COLUMN_MONTANT = "MontantBankRoll";




    public userDb(@Nullable Context context) {
        super(context, DATABSE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_NAME+" ("+COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +COLUMN_MONTANT+" TEXT );";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
}
