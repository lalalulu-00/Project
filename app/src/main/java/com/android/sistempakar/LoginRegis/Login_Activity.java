package com.android.sistempakar.LoginRegis;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.sistempakar.Home.Halaman_Utama;
import com.android.sistempakar.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Activity extends AppCompatActivity {
    private EditText email, password;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.editexttemail);
        password = findViewById(R.id.editexttpass);
        firebaseAuth = FirebaseAuth.getInstance();

        Button btnLogin = findViewById(R.id.buttonlogin);
        Button btnRegister = findViewById(R.id.buttonregis);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Login_Activity.this, Menu_Register.class));
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_Email = email.getText().toString();
                String text_Password = password.getText().toString();

                /*Define Condition If*/
                if (TextUtils.isEmpty(text_Email) || TextUtils.isEmpty(text_Password)){
                    Toast.makeText(Login_Activity.this, "All Field Required", Toast.LENGTH_SHORT).show();
                } else {
                    login(text_Email, text_Password);
                }
            }
        });


    }

    private void login(String text_email, String text_password) {
        firebaseAuth.signInWithEmailAndPassword(text_email, text_password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(Login_Activity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login_Activity.this, Halaman_Utama.class ));
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login_Activity.this, "Login Failure", Toast.LENGTH_SHORT).show();
                Log.e("Login Gagal", e.getMessage());
            }
        });
    }
}