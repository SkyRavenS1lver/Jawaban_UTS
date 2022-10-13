package com.example.jawaban_uts_revandra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class CariBerita extends AppCompatActivity {
    EditText tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_berita);
        tanggal = findViewById(R.id.Date);
        tanggal.setKeyListener(null);
    }
}