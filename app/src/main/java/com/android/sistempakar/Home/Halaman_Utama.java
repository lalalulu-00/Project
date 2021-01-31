package com.android.sistempakar.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.sistempakar.Artikel.Main_Artikel;
import com.android.sistempakar.Data.Menu_Data;
import com.android.sistempakar.Panduan.Menu_Tips;
import com.android.sistempakar.R;
import com.android.sistempakar.Solusi.Main_Skincare;

public class Halaman_Utama extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman__utama);

        ImageView imgskin = (ImageView) findViewById(R.id.imgskin);
        ImageView imgdata = (ImageView) findViewById(R.id.imgdata);
        ImageView imgsolusi = (ImageView) findViewById(R.id.imgsolusi);
        ImageView imgartikel = (ImageView) findViewById(R.id.imgartikel);



        imgskin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), Menu_Data.class);
                startActivity(i1);
            }
        });
        imgdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), Menu_Tips.class);
                startActivity(i2);
            }
        });
        imgsolusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), Main_Skincare.class);
                startActivity(i3);
            }
        });


        imgartikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(), Main_Artikel.class);
                startActivity(i4);
            }
        });

    }
}