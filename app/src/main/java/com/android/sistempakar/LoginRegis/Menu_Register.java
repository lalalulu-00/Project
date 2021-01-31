package com.android.sistempakar.LoginRegis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.sistempakar.R;
import com.android.sistempakar.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Menu_Register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText etnama, etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__register);

        mAuth = FirebaseAuth.getInstance();


        etnama = findViewById(R.id.edtnama);
        etEmail = findViewById(R.id.edtemail);
        etPassword = findViewById(R.id.etpass);

        Button btnregister = findViewById(R.id.btnregis);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String email = etEmail.getText().toString();
                final String password = etPassword.getText().toString();
                final String nama = etnama.getText().toString();

                if (email.equals("")) {
                    Toast.makeText(Menu_Register.this, "Silahkan isi Email Anda",
                            Toast.LENGTH_SHORT).show();
                } else if (password.equals("")) {
                    Toast.makeText(Menu_Register.this, "Silahkan isi Password Anda",
                            Toast.LENGTH_LONG).show();
                } else {

                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Menu_Register.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        String userId = user.getUid();

                                        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("User").child(userId);

                                        databaseReference.setValue(new User(userId, nama, email, password)).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                Toast.makeText(Menu_Register.this, "Account Created.",
                                                        Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(Menu_Register.this, Login_Activity.class));
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Toast.makeText(Menu_Register.this, "Authentication failed." + e.getMessage(),
                                                        Toast.LENGTH_SHORT).show();
                                            }
                                        });

                                    }

                                    // ...
                                }
                            });
                }
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
}