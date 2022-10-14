package com.example.jawaban_uts_revandra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

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
            listBerita.add(new Berita("Yogyakarta", "11 Oktober 2022","Pariwisata", R.drawable.yogya, getString(R.string.yogyakarta)));
            listBerita.add(new Berita("Lawang Sewu", "18 Januari 2022","Pariwisata", R.drawable.lawangsewu, getString(R.string.lawangSewu)));
            listBerita.add(new Berita("Borobudur", "8 Juni 2022","Pariwisata", R.drawable.borobudur, getString(R.string.borobudur)));
            listBerita.add(new Berita("Pulau Gili", "22 Agustus 2022","Pariwisata", R.drawable.gili, getString(R.string.gili)));
            listBerita.add(new Berita("Prambanan", "3 November 2021","Pariwisata", R.drawable.prambanan, getString(R.string.prambanan)));
            listBerita.add(new Berita("Bromo", "15 Oktober 2022","Pariwisata", R.drawable.bromo, getString(R.string.bromo)));
            listBerita.add(new Berita("Balekambang", "26 September 2022","Pariwisata", R.drawable.balekambang, getString(R.string.balekambang)));
            listBerita.add(new Berita("Sanur", "24 Juni 2022","Pariwisata", R.drawable.sanur, getString(R.string.sanur)));
            listBerita.add(new Berita("Goa Gajah", "24 Maret 2021","Pariwisata", R.drawable.gajah, getString(R.string.gajah)));
            listBerita.add(new Berita("Bali Safari", "25 Januari 2022","Pariwisata", R.drawable.safari, getString(R.string.safari)));
        }
        else if (pref.equals("Sport")){
            if (umur >= 18){listBerita.add(new Berita("Kanjuruhan", "14 Oktober 2022","Sport", R.drawable.kanjuruhan, getString(R.string.kanjuruhan)));}
            listBerita.add(new Berita("Alexis Expargaro", "14 Oktober 2022","Sport", R.drawable.motogp, getString(R.string.motogp)));
            listBerita.add(new Berita("Bulu Tangkis", "14 Oktober 2022","Sport", R.drawable.bulu, getString(R.string.bulutangkis)));
            listBerita.add(new Berita("Hasil TGIPF", "14 Oktober 2022","Sport", R.drawable.tgpif, getString(R.string.TGPIF)));
            listBerita.add(new Berita("Rank FIFA Timnas", "14 Oktober 2022","Sport", R.drawable.rank, getString(R.string.rank)));


        }
        else if (pref.equals("Politics")) {
            if (umur >= 18) {
                listBerita.add(new Berita("NasDem Kawal Jokowi", "15 Oktober 2022", "Politics", R.drawable.nasdem, getString(R.string.nasdem)));
                listBerita.add(new Berita("18 Partai Lolos", "14 Oktober 2022", "Politics", R.drawable.partai, getString(R.string.partai)));
                listBerita.add(new Berita("PDIP no Premanisme", "14 Oktober 2021","Politics", R.drawable.premanisme, getString(R.string.premanisme)));
            }
            listBerita.add(new Berita("Mars Perindo", "30 Agustus 2022", "Politics", R.drawable.perindo, getString(R.string.perindo)));
            listBerita.add(new Berita("Bagi Sepedah", "21 Desember 2021", "Politics", R.drawable.sepedah, getString(R.string.sepedah)));
        }
        else if (pref.equals("Entertainment")){
            listBerita.add(new Berita("Yogyakarta", "11-10-2022","Entertainment", R.drawable.yogya, getString(R.string.yogyakarta)));
        }
        else if (pref.equals("Crime")){
            if(umur < 18){TextView a = findViewById(R.id.JudulPage);a.setText("Maaf Tidak Ada Berita Terbaru!");}
            else {
                listBerita.add(new Berita("Yogyakarta", "11-10-2022", "Crime", R.drawable.yogya, getString(R.string.yogyakarta)));
            }}}
}