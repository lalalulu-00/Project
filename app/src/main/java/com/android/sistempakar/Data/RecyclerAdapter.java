package com.android.sistempakar.Data;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.android.sistempakar.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

  private List<mahasiswa> mList;

  private FirebaseAuth mAuth;
  private String currentUserID;
  private DatabaseReference Diagnosaref;

  public RecyclerAdapter(List<mahasiswa> mList){ this.mList = mList;}


    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater v = LayoutInflater.from(parent.getContext());
        View itemview = v.inflate(R.layout.layout_item, parent, false);


        mAuth = FirebaseAuth.getInstance();
        currentUserID = mAuth.getCurrentUser().getUid();
        Diagnosaref = FirebaseDatabase.getInstance().getReference("diagnosa").child(currentUserID);
        return new MyViewHolder(itemview);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {

      mahasiswa mahasiswa = mList.get(position);
      holder.tv_nama.setText("Nama : " +mahasiswa.getNama());
      holder.tv_jk.setText("Jenis_kelamin : " +mahasiswa.getJeniskelamin());
      holder.tv_umur.setText("Umur : " +mahasiswa.getUmur());
      holder.tv_alamat.setText("Alamat : " +mahasiswa.getAlamat());
      holder.tv_jeniskulit.setText("Jenis_kulit : " +mahasiswa.getJeniskulit());
      holder.tv_persentase.setText("Persentase : " +mahasiswa.getPersentase());
      holder.tv_Solusi.setText("Solusi :" +mahasiswa.getSolusi());
  }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_jk, tv_umur, tv_alamat, tv_jeniskulit, tv_persentase, tv_Solusi;

        CardView card_view;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nama = itemView.findViewById(R.id.tv_nama);
            tv_jk = itemView.findViewById(R.id.tv_jk);
            tv_umur = itemView.findViewById(R.id.tv_umur);
            tv_alamat = itemView.findViewById(R.id.tv_alamat);
            tv_jeniskulit = itemView.findViewById(R.id.tv_jeniskulit);
            tv_persentase = itemView.findViewById(R.id.tv_persentase);
            tv_Solusi = itemView.findViewById(R.id.tv_Solusi);
            card_view = itemView.findViewById(R.id.card_view);

        }
    }
}
