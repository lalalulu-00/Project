package com.android.sistempakar.Data;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.sistempakar.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Menu_Data extends AppCompatActivity {
    FloatingActionButton fab_add;
    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    private FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

    /*private  FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("Notebook");*/

    RecyclerAdapter recyclerAdapter;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference("diagnosa");
    ArrayList<mahasiswa> listmahasiswa;
    RecyclerView recyclerview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__data);


        fab_add = findViewById(R.id.fab_add);
        recyclerview = findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(mLayout);
        recyclerview.setItemAnimator(new DefaultItemAnimator());


        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogForm dialogForm = new DialogForm();
                dialogForm.show(getSupportFragmentManager(), "form");
            }
        });

        showData();
        /*setUpRecyclerview();*/

    }
    private  void showData(){
        String userId = firebaseUser.getUid();
        database.child(userId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listmahasiswa = new  ArrayList<>();
                for(DataSnapshot item : snapshot.getChildren()){
                    mahasiswa mhs = item.getValue(mahasiswa.class);
                    mhs.setKey(item.getKey());
                    listmahasiswa.add(mhs);
                }

                recyclerAdapter = new RecyclerAdapter(listmahasiswa);
                recyclerview.setAdapter(recyclerAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }



    /*private void setUpRecyclerview(){
        Query query = notebookRef.orderBy("nama", Query.Direction.DESCENDING);

        FirestoreRecyclerOptions<mahasiswa> options = new FirestoreRecyclerOptions.Builder<mahasiswa>()
                .setQuery(query, mahasiswa.class)
                .build();
        adapter = new RecyclerAdapter(options);

        RecyclerView  recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }*/

    /*@Override
    protected void onStart(){
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop(){
        super.onStop();
        adapter.startListening();
    }*/
}