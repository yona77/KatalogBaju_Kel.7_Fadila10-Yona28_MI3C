package com.example.user.tugas4;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuInsert extends AppCompatActivity {
    private MenuHelper dbHelper;
    private EditText nama, jenis, ukuran, harga;
    Button simpan, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_insert);
        dbHelper = new MenuHelper(this);

        nama = findViewById(R.id.editText1);
        jenis = findViewById(R.id.editText2);
        ukuran = findViewById(R.id.editText3);
        harga = findViewById(R.id.editText4);

        simpan = findViewById(R.id.button1);
        kembali = findViewById(R.id.button2);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO menu(nama, jenis, harga, bahan, review) values('" +
                        nama.getText().toString() + "', '" +
                        jenis.getText().toString() + "', '" +
                        ukuran.getText().toString() + "', '" +
                        harga.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), " Menu Berhasil ditambahkan",
                        Toast.LENGTH_LONG).show();

                HomeActivity.layarutama.TampilData();
                finish();
            }
        });

//        kembali ke halaman utama
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}
