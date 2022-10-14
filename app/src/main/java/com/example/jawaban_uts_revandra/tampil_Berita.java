package com.example.jawaban_uts_revandra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class tampil_Berita extends AppCompatActivity {
    private RecyclerView rvBerita;
    private ArrayList<Berita> listBerita = new ArrayList<>();
    private BeritaAdapter beritaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_berita);
        rvBerita = findViewById(R.id.rvBerita);




//        Intent getter = getIntent();
//        int umur = getter.getIntExtra("Umur", 100);
//        String pref = getter.getStringExtra("Preferensi");
        addBerita(CariBerita.umur, CariBerita.preferensi);
        beritaAdapter = new BeritaAdapter(this, listBerita);
        rvBerita.setLayoutManager(new LinearLayoutManager(this));
        rvBerita.setAdapter(beritaAdapter);


    }
    public void addBerita(int umur, String pref){
        if (pref.equals("Pariwisata")){
            listBerita.add(new Berita("Yogyakarta", 0, "11-10-2022","Pariwisata", R.drawable.yogya, getString(R.string.yogyakarta)));
    }
        if (pref.equals("Sport")){
            listBerita.add(new Berita("Kanjuruhan", 15, "11-10-2022","Sport", R.drawable.yogya, getString(R.string.yogyakarta)));
        }
        if (pref.equals("Politics")){
            listBerita.add(new Berita("Yogyakarta", 0, "11-10-2022","Politics", R.drawable.yogya, getString(R.string.yogyakarta)));
        }
        if (pref.equals("Entertainment")){
            listBerita.add(new Berita("Yogyakarta", 0, "11-10-2022","Entertainment", R.drawable.yogya, getString(R.string.yogyakarta)));
        }
        if (pref.equals("Crime")){
            listBerita.add(new Berita("Yogyakarta", 0, "11-10-2022","Crime", R.drawable.yogya, getString(R.string.yogyakarta)));
        }}
}