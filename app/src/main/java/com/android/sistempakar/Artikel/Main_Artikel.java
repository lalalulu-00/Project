package com.android.sistempakar.Artikel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.sistempakar.R;

public class Main_Artikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__artikel);

        TextView artikel1 = (TextView) findViewById(R.id.link1);
        TextView artikel2 = (TextView) findViewById(R.id.link2);
        TextView artikel3 = (TextView) findViewById(R.id.link3);
        TextView artikel4 = (TextView) findViewById(R.id.link4);
        TextView artikel5 = (TextView) findViewById(R.id.link5);
        TextView artikel6 = (TextView) findViewById(R.id.link6);
        TextView artikel7 = (TextView) findViewById(R.id.link7);
        TextView artikel8 = (TextView) findViewById(R.id.link8);
        TextView artikel9 = (TextView) findViewById(R.id.link9);
        TextView artikel10 = (TextView) findViewById(R.id.link10);
        TextView artikel11 = (TextView) findViewById(R.id.link11);




        artikel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link1 = new Intent(getApplicationContext(), Artikel1.class);
                startActivity(link1);
            }
        });
        artikel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link2= new Intent(getApplicationContext(), Atikel2.class);
                startActivity(link2);
            }
        });
        artikel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link3= new Intent(getApplicationContext(), Artikel3.class);
                startActivity(link3);
            }
        });
        artikel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link4= new Intent(getApplicationContext(), Artikel4.class);
                startActivity(link4);
            }
        });
        artikel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link5= new Intent(getApplicationContext(), Artikel5.class);
                startActivity(link5);
            }
        });
        artikel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link6= new Intent(getApplicationContext(), Artikel6.class);
                startActivity(link6);
            }
        });
        artikel7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link7= new Intent(getApplicationContext(), Artikel7.class);
                startActivity(link7);
            }
        });
        artikel8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link8= new Intent(getApplicationContext(), Artikel8.class);
                startActivity(link8);
            }
        });
        artikel9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link9= new Intent(getApplicationContext(), Artikel9.class);
                startActivity(link9);
            }
        });
        artikel10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link10= new Intent(getApplicationContext(), Artikel10.class);
                startActivity(link10);
            }
        });
        artikel11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link11= new Intent(getApplicationContext(), Artikel11.class);
                startActivity(link11);
            }
        });
    }
}