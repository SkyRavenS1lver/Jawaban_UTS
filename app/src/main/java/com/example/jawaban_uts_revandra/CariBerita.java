package com.example.jawaban_uts_revandra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CariBerita extends AppCompatActivity {
    Spinner spinnerText;
    String mSpinnerText;
    EditText tanggal;
    Button cari;
    public static int umur;
    public static String preferensi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_berita);
        cari = findViewById(R.id.cari);

        spinnerText = findViewById(R.id.Status);

        tanggal = findViewById(R.id.Date);
        tanggal.setKeyListener(null);

        //Button Listener
        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cari_berita();
            }
        });

        // Making spinner & the adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.statuses, R.layout.item);
        adapter.setDropDownViewResource(R.layout.dropitem);
        spinnerText.setAdapter(adapter);
        if (spinnerText != null){
//            spinnerText.setOnItemSelectedListener(this);
        }

        //Making the popup
        tanggal.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){showDataPicker();}
            }
        });
        tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDataPicker();
            }
        });

    }
    public void showDataPicker(){
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), "date-picker");}

    public void processDatePicker(int day, int month, int year){
        String day_string = Integer.toString(day);
        String month_string = Integer.toString(month+1);
        String year_string = Integer.toString(year);
        String dateMessage = day_string + "-" + month_string + "-" + year_string;
        Calendar currentDate = new GregorianCalendar();
        umur = currentDate.get(Calendar.YEAR) - year;
        if (month > currentDate.get(Calendar.MONTH) || (month == currentDate.get(Calendar.MONTH) &&
                day > currentDate.get(Calendar.DAY_OF_MONTH)))
        {umur--;}
        tanggal.setText(dateMessage);
    }
    public void cari_berita(){
//        String preferensi = spinnerText.getSelectedItem().toString();
        preferensi = spinnerText.getSelectedItem().toString();
        Intent tampilkan = new Intent(CariBerita.this, tampil_Berita.class);
//        tampilkan.putExtra("Umur",umur);
//        tampilkan.putExtra("Preferensi",preferensi);
        startActivity(tampilkan);
    }



//    //Spinner Logic
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        mSpinnerText = adapterView.getItemAtPosition(i).toString();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//    }
}