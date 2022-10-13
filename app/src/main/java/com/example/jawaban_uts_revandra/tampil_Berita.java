package com.example.jawaban_uts_revandra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class tampil_Berita extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Berita> berita = new ArrayList<>();
    private BeritaAdapter beritaAdapter;
    TextView tv1;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_berita);
        tv1 = findViewById(R.id.atv1);
        tv2 = findViewById(R.id.atv2);

        Intent getter = getIntent();
        String umur =getter.getStringExtra("Umur");
        String pref =getter.getStringExtra("Preferensi");
        tv1.setText(umur);
        tv2.setText(pref);

    }
}