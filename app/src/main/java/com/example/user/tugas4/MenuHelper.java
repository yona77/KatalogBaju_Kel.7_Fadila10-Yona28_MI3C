package com.example.user.tugas4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MenuHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "fashionwoman.db";
    private static final int DATABASE_VERSION= 1;

    private static final String ID = "id";
    private static final String NAMA = "nama";
    private static final String JENIS = "jenis";
    private static final String UKURAN = "ukuran";
    private static final String HARGA = "harga";
    private static final String BAHAN = "bahan";

    private static final String CREATE_TABLE_MENU = "CREATE TABLE menu (" +
            ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            NAMA + " VARCHAR(100), " +
            JENIS + " VARCHAR(30), " +
            UKURAN + " VARCHAR(10),"+
            HARGA + " VARCHAR(30)) ";

    public MenuHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_MENU);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

