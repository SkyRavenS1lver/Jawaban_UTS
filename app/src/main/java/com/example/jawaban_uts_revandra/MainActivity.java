package com.example.jawaban_uts_revandra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn1;
    String username, password;
    public static ArrayList<Berita> Kumpulan_berita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn1 = findViewById(R.id.btn1);



    }

    public void login(View view){
        String username = "pakjoko";
        String password = "yangpentingcuan";
        if(et1.getText().toString().equals(username) && et2.getText().toString().equals(password)){
            Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, CariBerita.class);
            startActivity(intent);
        } else {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//            alertDialog.setTitle("Alert");
            alertDialog.setMessage("Mohon Maaf Password atau Username salah!");
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    }




}