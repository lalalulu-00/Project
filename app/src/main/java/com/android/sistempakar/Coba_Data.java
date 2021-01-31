package com.android.sistempakar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Coba_Data extends AppCompatActivity {

    EditText editTextName;
    Button buttonsave;
    Spinner spinnerGenres;

    DatabaseReference databaseadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba__data);

        databaseadd = FirebaseDatabase.getInstance().getReference("add");

        editTextName = (EditText) findViewById(R.id.editTextName);
        buttonsave = (Button) findViewById(R.id.buttonAdd);
        spinnerGenres = (Spinner) findViewById(R.id.spinnerGenres);

        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
    }

    private void add(){
        String name = editTextName.getText().toString().trim();
        String genre = spinnerGenres.getSelectedItem().toString();

        if(!TextUtils.isEmpty(name)){

            String id = databaseadd.push().getKey();
            add add = new add(id, name, genre);

            databaseadd.child(id).setValue(add);

            Toast.makeText(this, "Nama added", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Anda Harus memasukan Nama", Toast.LENGTH_LONG).show();
        }
    }
}