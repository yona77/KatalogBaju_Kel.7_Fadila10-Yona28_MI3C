package com.example.user.tugas4;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuView extends AppCompatActivity {
    private MenuHelper dbHelper;
    public TextView nama,jenis,ukuran,harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_view);

        Intent intent = getIntent();

        nama = findViewById(R.id.nama);
        jenis = findViewById(R.id.jenis);
        ukuran=findViewById(R.id.ukuran);
        harga=findViewById(R.id.harga);

        dbHelper = new MenuHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        int id = Integer.parseInt(intent.getStringExtra("id"));
        Cursor cursor = db.rawQuery( "SELECT * FROM  menu WHERE id="+id, null);
        if (cursor.getCount()>0) {
            cursor.moveToPosition(0);

            nama.setText(cursor.getString(1));
            jenis.setText(cursor.getString(2));
            ukuran.setText(cursor.getString(3));
            harga.setText("Rp "+cursor.getString(4));


        }
    }
}
