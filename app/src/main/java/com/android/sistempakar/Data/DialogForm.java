package com.android.sistempakar.Data;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.android.sistempakar.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;


public class DialogForm extends DialogFragment {
    String nama, jeniskelamin,  umur, alamat, jeniskulit, solusi;
    double persentase;
    DecimalFormat precision =  new DecimalFormat("#.##");
    /*Define Database Reference with Firebase*/
    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    private FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

    public DialogForm() {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
        this.alamat = alamat;
        this.jeniskulit = jeniskulit;
        this.persentase = persentase;
        this.solusi = solusi;
    }

    String[] nilaikeyakinanG1 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG2 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG3 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG4 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG5 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG6 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG7 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG8 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG9 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG10 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG11 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG12 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG13 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG14 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG15 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG16 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG17 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG18 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG19 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG20 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG21 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG22 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG23 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG24 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG25 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG26 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG27 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG28 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG29 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG30 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG31 = {"0", "0.2", "0.4", "0.6", "0.8", "1"};


    EditText txtnama, txtjk, txtumur, txtalamat;
    TextView tv_nama, tv_jk, tv_umur, tv_alamat, tv_jeniskulit, tv_persentase, tv_Solusi;
    Button btnhasil;
    CheckBox G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,G12,G13,G14,G15,G16,G17,G18,G19,G20,G21,G22,G23,G24,G25,G26,G27,G28,G29,G30,G31;
    AutoCompleteTextView act1, act2, act3, act4, act5, act6, act7, act8, act9, act10, act11, act12, act13, act14, act15, act16,act17, act18, act19, act20,act21, act22, act23, act24,act25, act26, act27, act28,act29, act30, act31;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.input_form,container,false);

        //TextView
        txtnama = v.findViewById(R.id.txtnama);
        txtjk = v.findViewById(R.id.txtjk);
        txtumur = v.findViewById(R.id.txtumur);
        txtalamat = v.findViewById(R.id.txtalamat);
        tv_nama= v.findViewById(R.id.tv_nama);
        tv_jk = v.findViewById(R.id.tv_jk);
        tv_umur = v.findViewById(R.id.tv_umur);
        tv_alamat = v.findViewById(R.id.tv_alamat);
        tv_jeniskulit = v.findViewById(R.id.tv_jeniskulit);
        tv_persentase = v.findViewById(R.id.tv_persentase);
        tv_Solusi = v.findViewById(R.id.tv_Solusi);



        //Button
        btnhasil = v.findViewById(R.id.btnhasil);


        txtnama.setText(nama);
        txtjk.setText(jeniskelamin);
        txtumur.setText(umur);
        txtalamat.setText(alamat);

        G1 = v.findViewById(R.id.G1);
        G2 = v.findViewById(R.id.G2);
        G3 = v.findViewById(R.id.G3);
        G4 = v.findViewById(R.id.G4);
        G5 = v.findViewById(R.id.G5);
        G6 = v.findViewById(R.id.G6);
        G7 = v.findViewById(R.id.G7);
        G8 = v.findViewById(R.id.G8);
        G9 = v.findViewById(R.id.G9);
        G10 = v.findViewById(R.id.G10);
        G11 = v.findViewById(R.id.G11);
        G12 = v.findViewById(R.id.G12);
        G13 = v.findViewById(R.id.G13);
        G14 = v.findViewById(R.id.G14);
        G15 = v.findViewById(R.id.G15);
        G16 = v.findViewById(R.id.G16);
        G17 = v.findViewById(R.id.G17);
        G18 = v.findViewById(R.id.G18);
        G19 = v.findViewById(R.id.G19);
        G20 = v.findViewById(R.id.G20);
        G21 = v.findViewById(R.id.G21);
        G22 = v.findViewById(R.id.G22);
        G23 = v.findViewById(R.id.G23);
        G24 = v.findViewById(R.id.G24);
        G25 = v.findViewById(R.id.G25);
        G26 = v.findViewById(R.id.G26);
        G27 = v.findViewById(R.id.G27);
        G28 = v.findViewById(R.id.G28);
        G29 = v.findViewById(R.id.G29);
        G30 = v.findViewById(R.id.G30);
        G31 = v.findViewById(R.id.G31);


        act1 = v.findViewById(R.id.autoCompleteTextView1);
        act2 = v.findViewById(R.id.autoCompleteTextView2);
        act3 = v.findViewById(R.id.autoCompleteTextView3);
        act4 = v.findViewById(R.id.autoCompleteTextView4);
        act5 = v.findViewById(R.id.autoCompleteTextView5);
        act6 = v.findViewById(R.id.autoCompleteTextView6);
        act7 = v.findViewById(R.id.autoCompleteTextView7);
        act8 = v.findViewById(R.id.autoCompleteTextView8);
        act9 = v.findViewById(R.id.autoCompleteTextView9);
        act10 = v.findViewById(R.id.autoCompleteTextView10);
        act11= v.findViewById(R.id.autoCompleteTextView11);
        act12 = v.findViewById(R.id.autoCompleteTextView12);
        act13 = v.findViewById(R.id.autoCompleteTextView13);
        act14 = v.findViewById(R.id.autoCompleteTextView14);
        act15 = v.findViewById(R.id.autoCompleteTextView15);
        act16 = v.findViewById(R.id.autoCompleteTextView16);
        act17 = v.findViewById(R.id.autoCompleteTextView17);
        act18 = v.findViewById(R.id.autoCompleteTextView18);
        act19 = v.findViewById(R.id.autoCompleteTextView19);
        act20 = v.findViewById(R.id.autoCompleteTextView20);
        act21 = v.findViewById(R.id.autoCompleteTextView21);
        act22 = v.findViewById(R.id.autoCompleteTextView22);
        act23 = v.findViewById(R.id.autoCompleteTextView23);
        act24 = v.findViewById(R.id.autoCompleteTextView24);
        act25 = v.findViewById(R.id.autoCompleteTextView25);
        act26 = v.findViewById(R.id.autoCompleteTextView26);
        act27 = v.findViewById(R.id.autoCompleteTextView27);
        act28 = v.findViewById(R.id.autoCompleteTextView28);
        act29 = v.findViewById(R.id.autoCompleteTextView29);
        act30 = v.findViewById(R.id.autoCompleteTextView30);
        act31 = v.findViewById(R.id.autoCompleteTextView31);



        final ArrayAdapter<String> adapterG1 = new ArrayAdapter<>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG1);
        act1.setThreshold(1);
        act1.setAdapter(adapterG1);

        final ArrayAdapter<String> adapterG2 = new ArrayAdapter<>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG2);
        act2.setThreshold(1);
        act2.setAdapter(adapterG2);

        final ArrayAdapter<String> adapterG3 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG3);
        act3.setThreshold(1);
        act3.setAdapter(adapterG3);

        final ArrayAdapter<String> adapterG4 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG4);
        act4.setThreshold(1);
        act4.setAdapter(adapterG4);

        final ArrayAdapter<String> adapterG5 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG5);
        act5.setThreshold(1);
        act5.setAdapter(adapterG5);

        final ArrayAdapter<String> adapterG6 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG6);
        act6.setThreshold(1);
        act6.setAdapter(adapterG6);

        final ArrayAdapter<String> adapterG7 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG7);
        act7.setThreshold(1);
        act7.setAdapter(adapterG7);

        final ArrayAdapter<String> adapterG8 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG8);
        act8.setThreshold(1);
        act8.setAdapter(adapterG8);

        final ArrayAdapter<String> adapterG9 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG9);
        act9.setThreshold(1);
        act9.setAdapter(adapterG9);
        final ArrayAdapter<String> adapterG10 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG10);
        act10.setThreshold(1);
        act10.setAdapter(adapterG10);

        final ArrayAdapter<String> adapterG11 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG11);
        act11.setThreshold(1);
        act11.setAdapter(adapterG11);

        final ArrayAdapter<String> adapterG12 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG12);
        act12.setThreshold(1);
        act12.setAdapter(adapterG12);
        final ArrayAdapter<String> adapterG13 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG13);
        act13.setThreshold(1);
        act13.setAdapter(adapterG13);

        final ArrayAdapter<String> adapterG14 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG14);
        act14.setThreshold(1);
        act14.setAdapter(adapterG14);

        final ArrayAdapter<String> adapterG15 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG15);
        act15.setThreshold(1);
        act15.setAdapter(adapterG15);

        final ArrayAdapter<String> adapterG16 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG16);
        act16.setThreshold(1);
        act16.setAdapter(adapterG16);

        final ArrayAdapter<String> adapterG17 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG17);
        act17.setThreshold(1);
        act17.setAdapter(adapterG17);

        final ArrayAdapter<String> adapterG18 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG18);
        act18.setThreshold(1);
        act18.setAdapter(adapterG18);

        final ArrayAdapter<String> adapterG19 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG19);
        act19.setThreshold(1);
        act19.setAdapter(adapterG19);
        final ArrayAdapter<String> adapterG20 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG20);
        act20.setThreshold(1);
        act20.setAdapter(adapterG20);

        final ArrayAdapter<String> adapterG21 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG21);
        act21.setThreshold(1);
        act21.setAdapter(adapterG21);

        final ArrayAdapter<String> adapterG22 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG22);
        act22.setThreshold(1);
        act22.setAdapter(adapterG22);

        final ArrayAdapter<String> adapterG23 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG23);
        act23.setThreshold(1);
        act23.setAdapter(adapterG23);

        final ArrayAdapter<String> adapterG24 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG24);
        act24.setThreshold(1);
        act24.setAdapter(adapterG24);

        final ArrayAdapter<String> adapterG25 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG25);
        act25.setThreshold(1);
        act25.setAdapter(adapterG25);

        final ArrayAdapter<String> adapterG26 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG26);
        act26.setThreshold(1);
        act26.setAdapter(adapterG26);

        final ArrayAdapter<String> adapterG27 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG27);
        act27.setThreshold(1);
        act27.setAdapter(adapterG27);

        final ArrayAdapter<String> adapterG28 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG28);
        act28.setThreshold(1);
        act28.setAdapter(adapterG28);

        final ArrayAdapter<String> adapterG29 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG29);
        act29.setThreshold(1);
        act29.setAdapter(adapterG29);

        final ArrayAdapter<String> adapterG30 = new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG30);
        act30.setThreshold(1);
        act30.setAdapter(adapterG30);

        final ArrayAdapter<String> adapterG31= new ArrayAdapter<String>(v.getContext(), android.R.layout.select_dialog_item, nilaikeyakinanG31);
        act31.setThreshold(1);
        act31.setAdapter(adapterG31);




        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala").setAdapter(adapterG1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act1.setText(nilaikeyakinanG1[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala").setAdapter(adapterG2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act2.setText(nilaikeyakinanG2[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala").setAdapter(adapterG3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act3.setText(nilaikeyakinanG3[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala").setAdapter(adapterG4, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act4.setText(nilaikeyakinanG4[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 5").setAdapter(adapterG5, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act5.setText(nilaikeyakinanG5[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 6").setAdapter(adapterG6, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act6.setText(nilaikeyakinanG6[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 7").setAdapter(adapterG7, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act7.setText(nilaikeyakinanG7[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 8").setAdapter(adapterG8, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act8.setText(nilaikeyakinanG8[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 9").setAdapter(adapterG9, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act9.setText(nilaikeyakinanG9[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 10").setAdapter(adapterG10, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act10.setText(nilaikeyakinanG10[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 11").setAdapter(adapterG11, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act11.setText(nilaikeyakinanG11[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 12").setAdapter(adapterG12, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act12.setText(nilaikeyakinanG12[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 13").setAdapter(adapterG13, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act13.setText(nilaikeyakinanG13[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 14").setAdapter(adapterG14, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act14.setText(nilaikeyakinanG14[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 15").setAdapter(adapterG15, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act15.setText(nilaikeyakinanG15[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 16").setAdapter(adapterG16, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act16.setText(nilaikeyakinanG16[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 17").setAdapter(adapterG17, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act17.setText(nilaikeyakinanG17[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 19").setAdapter(adapterG19, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act19.setText(nilaikeyakinanG19[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 20").setAdapter(adapterG20, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act20.setText(nilaikeyakinanG20[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 21").setAdapter(adapterG21, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act21.setText(nilaikeyakinanG21[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 22").setAdapter(adapterG22, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act22.setText(nilaikeyakinanG22[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 23").setAdapter(adapterG23, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act23.setText(nilaikeyakinanG23[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 24").setAdapter(adapterG24, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act24.setText(nilaikeyakinanG24[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        act25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 25").setAdapter(adapterG25, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act25.setText(nilaikeyakinanG25[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 26").setAdapter(adapterG26, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act26.setText(nilaikeyakinanG26[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 27").setAdapter(adapterG27, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act27.setText(nilaikeyakinanG27[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 28").setAdapter(adapterG28, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act28.setText(nilaikeyakinanG28[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });act29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 29").setAdapter(adapterG29, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act29.setText(nilaikeyakinanG29[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 30").setAdapter(adapterG30, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act30.setText(nilaikeyakinanG30[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 31").setAdapter(adapterG31, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act31.setText(nilaikeyakinanG31[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });



        act18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext()).setTitle("Pilih Nilai Gejala 18").setAdapter(adapterG18, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act18.setText(nilaikeyakinanG18[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });
        //Mengatur Aktif & Non-aktif Checkbox dan ACT untuk pilihan gejala kulit Normal
        G2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                if (cb.isChecked()){
                    //checkbox automatis ceklis
                    G1.setChecked(true);
                    G5.setChecked(true);
                    G11.setChecked(true);
                    G30.setChecked(true);
                    G3.setChecked(true);
                    G4.setChecked(true);
                    G6.setChecked(true);

                    //Checkbox Non-aktif
                    G10.setEnabled(false);
                    G12.setEnabled(false);
                    G13.setEnabled(false);
                    G20.setEnabled(false);
                    G27.setEnabled(false);
                    G31.setEnabled(false);
                    G16.setEnabled(false);
                    G23.setEnabled(false);
                    G25.setEnabled(false);
                    G26.setEnabled(false);
                    G27.setEnabled(false);
                    G28.setEnabled(false);
                    G29.setEnabled(false);
                    G31.setEnabled(false);
                    G7.setEnabled(false);
                    G8.setEnabled(false);
                    G9.setEnabled(false);
                    G14.setEnabled(false);
                    G15.setEnabled(false);
                    G16.setEnabled(false);
                    G17.setEnabled(false);
                    G18.setEnabled(false);
                    G19.setEnabled(false);
                    G21.setEnabled(false);
                    G22.setEnabled(false);
                    G24.setEnabled(false);

                    act10.setEnabled(false);
                    act12.setEnabled(false);
                    act13.setEnabled(false);
                    act20.setEnabled(false);
                    act27.setEnabled(false);
                    act31.setEnabled(false);
                    act16.setEnabled(false);
                    act23.setEnabled(false);
                    act25.setEnabled(false);
                    act26.setEnabled(false);
                    act27.setEnabled(false);
                    act28.setEnabled(false);
                    act29.setEnabled(false);
                    act31.setEnabled(false);
                    act7.setEnabled(false);
                    act8.setEnabled(false);
                    act9.setEnabled(false);
                    act14.setEnabled(false);
                    act15.setEnabled(false);
                    act16.setEnabled(false);
                    act17.setEnabled(false);
                    act18.setEnabled(false);
                    act19.setEnabled(false);
                    act21.setEnabled(false);
                    act22.setEnabled(false);
                    act24.setEnabled(false);
                }else{
                    G1.setChecked(false);
                    G5.setChecked(false);
                    G11.setChecked(false);
                    G30.setChecked(false);
                    G3.setChecked(false);
                    G4.setChecked(false);
                    G6.setChecked(false);


                    G10.setEnabled(true);
                    G12.setEnabled(true);
                    G13.setEnabled(true);
                    G20.setEnabled(true);
                    G27.setEnabled(true);
                    G31.setEnabled(true);
                    G16.setEnabled(true);
                    G23.setEnabled(true);
                    G25.setEnabled(true);
                    G26.setEnabled(true);
                    G27.setEnabled(true);
                    G28.setEnabled(true);
                    G29.setEnabled(true);
                    G31.setEnabled(true);
                    G7.setEnabled(true);
                    G8.setEnabled(true);
                    G9.setEnabled(true);
                    G14.setEnabled(true);
                    G15.setEnabled(true);
                    G16.setEnabled(true);
                    G17.setEnabled(true);
                    G18.setEnabled(true);
                    G19.setEnabled(true);
                    G21.setEnabled(true);
                    G22.setEnabled(true);
                    G24.setEnabled(true);

                    act10.setEnabled(true);
                    act12.setEnabled(true);
                    act13.setEnabled(true);
                    act20.setEnabled(true);
                    act27.setEnabled(true);
                    act31.setEnabled(true);
                    act16.setEnabled(true);
                    act23.setEnabled(true);
                    act25.setEnabled(true);
                    act26.setEnabled(true);
                    act27.setEnabled(true);
                    act28.setEnabled(true);
                    act29.setEnabled(true);
                    act31.setEnabled(true);
                    act7.setEnabled(true);
                    act8.setEnabled(true);
                    act9.setEnabled(true);
                    act14.setEnabled(true);
                    act15.setEnabled(true);
                    act16.setEnabled(true);
                    act17.setEnabled(true);
                    act18.setEnabled(true);
                    act19.setEnabled(true);
                    act21.setEnabled(true);
                    act22.setEnabled(true);
                    act24.setEnabled(true);
                }
            }

        });
        //Mengatur Checkbox dan ACT untuk pilihan gejala kulit Kering
        G10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                if (cb.isChecked()){
                    G1.setChecked(true);
                    G5.setChecked(true);
                    G11.setChecked(true);
                    G30.setChecked(true);
                    G12.setChecked(true);
                    G13.setChecked(true);
                    G20.setChecked(true);
                    G27.setChecked(true);
                    G31.setChecked(true);

                    G2.setEnabled(false);
                    G3.setEnabled(false);
                    G4.setEnabled(false);
                    G6.setEnabled(false);
                    G16.setEnabled(false);
                    G23.setEnabled(false);
                    G25.setEnabled(false);
                    G26.setEnabled(false);
                    G28.setEnabled(false);
                    G29.setEnabled(false);
                    G7.setEnabled(false);
                    G8.setEnabled(false);
                    G9.setEnabled(false);
                    G14.setEnabled(false);
                    G15.setEnabled(false);
                    G16.setEnabled(false);
                    G17.setEnabled(false);
                    G18.setEnabled(false);
                    G19.setEnabled(false);
                    G21.setEnabled(false);
                    G22.setEnabled(false);
                    G24.setEnabled(false);

                    act3.setEnabled(false);
                    act4.setEnabled(false);
                    act6.setEnabled(false);
                    act2.setEnabled(false);
                    act16.setEnabled(false);
                    act23.setEnabled(false);
                    act25.setEnabled(false);
                    act26.setEnabled(false);
                    act28.setEnabled(false);
                    act29.setEnabled(false);
                    act7.setEnabled(false);
                    act8.setEnabled(false);
                    act9.setEnabled(false);
                    act14.setEnabled(false);
                    act15.setEnabled(false);
                    act16.setEnabled(false);
                    act17.setEnabled(false);
                    act18.setEnabled(false);
                    act19.setEnabled(false);
                    act21.setEnabled(false);
                    act22.setEnabled(false);
                    act24.setEnabled(false);
                }else{
                    G1.setChecked(false);
                    G5.setChecked(false);
                    G11.setChecked(false);
                    G30.setChecked(false);
                    G12.setChecked(false);
                    G13.setChecked(false);
                    G20.setChecked(false);
                    G27.setChecked(false);
                    G31.setChecked(false);


                    G2.setEnabled(true);
                    G3.setEnabled(true);
                    G4.setEnabled(true);
                    G6.setEnabled(true);
                    G16.setEnabled(true);
                    G23.setEnabled(true);
                    G25.setEnabled(true);
                    G26.setEnabled(true);
                    G28.setEnabled(true);
                    G29.setEnabled(true);
                    G7.setEnabled(true);
                    G8.setEnabled(true);
                    G9.setEnabled(true);
                    G14.setEnabled(true);
                    G15.setEnabled(true);
                    G16.setEnabled(true);
                    G17.setEnabled(true);
                    G18.setEnabled(true);
                    G19.setEnabled(true);
                    G21.setEnabled(true);
                    G22.setEnabled(true);
                    G24.setEnabled(true);

                    act2.setEnabled(true);
                    act3.setEnabled(true);
                    act4.setEnabled(true);
                    act6.setEnabled(true);
                    act16.setEnabled(true);
                    act23.setEnabled(true);
                    act25.setEnabled(true);
                    act26.setEnabled(true);
                    act28.setEnabled(true);
                    act29.setEnabled(true);
                    act7.setEnabled(true);
                    act8.setEnabled(true);
                    act9.setEnabled(true);
                    act14.setEnabled(true);
                    act15.setEnabled(true);
                    act16.setEnabled(true);
                    act17.setEnabled(true);
                    act18.setEnabled(true);
                    act19.setEnabled(true);
                    act21.setEnabled(true);
                    act22.setEnabled(true);
                    act24.setEnabled(true);
                }
            }

        });
        //Mengatur Checkbox dan ACT untuk pilihan gejala kulit Berminyak
        G8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                if (cb.isChecked()){
                    G7.setChecked(true);
                    G16.setChecked(true);
                    G23.setChecked(true);
                    G25.setChecked(true);
                    G26.setChecked(true);
                    G9.setChecked(true);
                    G24.setChecked(true);
                    G27.setChecked(true);



                    G1.setEnabled(false);
                    G2.setEnabled(false);
                    G3.setEnabled(false);
                    G4.setEnabled(false);
                    G5.setEnabled(false);
                    G6.setEnabled(false);
                    G10.setEnabled(false);
                    G11.setEnabled(false);
                    G12.setEnabled(false);
                    G13.setEnabled(false);
                    G14.setEnabled(false);
                    G15.setEnabled(false);
                    G17.setEnabled(false);
                    G18.setEnabled(false);
                    G19.setEnabled(false);
                    G20.setEnabled(false);
                    G21.setEnabled(false);
                    G22.setEnabled(false);
                    G28.setEnabled(false);
                    G29.setEnabled(false);
                    G30.setEnabled(false);
                    G31.setEnabled(false);


                    act1.setEnabled(false);
                    act2.setEnabled(false);
                    act3.setEnabled(false);
                    act4.setEnabled(false);
                    act5.setEnabled(false);
                    act6.setEnabled(false);
                    act10.setEnabled(false);
                    act11.setEnabled(false);
                    act12.setEnabled(false);
                    act13.setEnabled(false);
                    act14.setEnabled(false);
                    act15.setEnabled(false);
                    act17.setEnabled(false);
                    act18.setEnabled(false);
                    act19.setEnabled(false);
                    act20.setEnabled(false);
                    act21.setEnabled(false);
                    act22.setEnabled(false);
                    act28.setEnabled(false);
                    act29.setEnabled(false);
                    act30.setEnabled(false);
                    act31.setEnabled(false);
                }else{
                    G7.setChecked(false);
                    G16.setChecked(false);
                    G23.setChecked(false);
                    G25.setChecked(false);
                    G26.setChecked(false);
                    G9.setChecked(false);
                    G24.setChecked(false);
                    G27.setChecked(false);

                    G1.setEnabled(true);
                    G2.setEnabled(true);
                    G3.setEnabled(true);
                    G4.setEnabled(true);
                    G5.setEnabled(true);
                    G6.setEnabled(true);
                    G10.setEnabled(true);
                    G11.setEnabled(true);
                    G12.setEnabled(true);
                    G13.setEnabled(true);
                    G14.setEnabled(true);
                    G15.setEnabled(true);
                    G17.setEnabled(true);
                    G18.setEnabled(true);
                    G19.setEnabled(true);
                    G20.setEnabled(true);
                    G21.setEnabled(true);
                    G22.setEnabled(true);
                    G28.setEnabled(true);
                    G29.setEnabled(true);
                    G30.setEnabled(true);
                    G31.setEnabled(true);


                    act1.setEnabled(true);
                    act2.setEnabled(true);
                    act3.setEnabled(true);
                    act4.setEnabled(true);
                    act5.setEnabled(true);
                    act6.setEnabled(true);
                    act10.setEnabled(true);
                    act11.setEnabled(true);
                    act12.setEnabled(true);
                    act13.setEnabled(true);
                    act14.setEnabled(true);
                    act15.setEnabled(true);
                    act17.setEnabled(true);
                    act18.setEnabled(true);
                    act19.setEnabled(true);
                    act20.setEnabled(true);
                    act21.setEnabled(true);
                    act22.setEnabled(true);
                    act28.setEnabled(true);
                    act29.setEnabled(true);
                    act30.setEnabled(true);
                    act31.setEnabled(true);
                }
            }

        });
        //Mengatur Checkbox dan ACT untuk pilihan gejala kulit Kombinasi
        G14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                if (cb.isChecked()){
                    G7.setChecked(true);
                    G16.setChecked(true);
                    G23.setChecked(true);
                    G25.setChecked(true);
                    G26.setChecked(true);
                    G15.setChecked(true);
                    G17.setChecked(true);


                    G1.setEnabled(false);
                    G2.setEnabled(false);
                    G3.setEnabled(false);
                    G4.setEnabled(false);
                    G5.setEnabled(false);
                    G6.setEnabled(false);
                    G10.setEnabled(false);
                    G11.setEnabled(false);
                    G12.setEnabled(false);
                    G13.setEnabled(false);
                    G8.setEnabled(false);
                    G9.setEnabled(false);
                    G24.setEnabled(false);
                    G27.setEnabled(false);
                    G18.setEnabled(false);
                    G19.setEnabled(false);
                    G20.setEnabled(false);
                    G21.setEnabled(false);
                    G22.setEnabled(false);
                    G28.setEnabled(false);
                    G29.setEnabled(false);
                    G30.setEnabled(false);
                    G31.setEnabled(false);


                    act1.setEnabled(false);
                    act2.setEnabled(false);
                    act3.setEnabled(false);
                    act4.setEnabled(false);
                    act5.setEnabled(false);
                    act6.setEnabled(false);
                    act10.setEnabled(false);
                    act11.setEnabled(false);
                    act12.setEnabled(false);
                    act13.setEnabled(false);
                    act8.setEnabled(false);
                    act9.setEnabled(false);
                    act24.setEnabled(false);
                    act27.setEnabled(false);
                    act18.setEnabled(false);
                    act19.setEnabled(false);
                    act20.setEnabled(false);
                    act21.setEnabled(false);
                    act22.setEnabled(false);
                    act28.setEnabled(false);
                    act29.setEnabled(false);
                    act30.setEnabled(false);
                    act31.setEnabled(false);
                }else{
                    G7.setChecked(false);
                    G16.setChecked(false);
                    G23.setChecked(false);
                    G25.setChecked(false);
                    G26.setChecked(false);
                    G15.setChecked(false);
                    G17.setChecked(false);

                    G1.setEnabled(true);
                    G2.setEnabled(true);
                    G3.setEnabled(true);
                    G4.setEnabled(true);
                    G5.setEnabled(true);
                    G6.setEnabled(true);
                    G10.setEnabled(true);
                    G11.setEnabled(true);
                    G12.setEnabled(true);
                    G13.setEnabled(true);
                    G8.setEnabled(true);
                    G9.setEnabled(true);
                    G24.setEnabled(true);
                    G28.setEnabled(true);
                    G18.setEnabled(true);
                    G19.setEnabled(true);
                    G20.setEnabled(true);
                    G21.setEnabled(true);
                    G22.setEnabled(true);
                    G28.setEnabled(true);
                    G29.setEnabled(true);
                    G30.setEnabled(true);
                    G31.setEnabled(true);


                    act1.setEnabled(true);
                    act2.setEnabled(true);
                    act3.setEnabled(true);
                    act4.setEnabled(true);
                    act5.setEnabled(true);
                    act6.setEnabled(true);
                    act10.setEnabled(true);
                    act11.setEnabled(true);
                    act12.setEnabled(true);
                    act13.setEnabled(true);
                    act8.setEnabled(true);
                    act9.setEnabled(true);
                    act24.setEnabled(true);
                    act27.setEnabled(true);
                    act18.setEnabled(true);
                    act19.setEnabled(true);
                    act20.setEnabled(true);
                    act21.setEnabled(true);
                    act22.setEnabled(true);
                    act28.setEnabled(true);
                    act29.setEnabled(true);
                    act30.setEnabled(true);
                    act31.setEnabled(true);
                }
            }

        });
        //Mengatur Checkbox dan ACT untuk pilihan gejala kulit Sensitif
        G18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
                if (cb.isChecked()){
                    G9.setChecked(true);
                    G12.setChecked(true);
                    G19.setChecked(true);
                    G20.setChecked(true);
                    G21.setChecked(true);
                    G22.setChecked(true);
                    G28.setChecked(true);
                    G29.setChecked(true);

                    G1.setEnabled(false);
                    G2.setEnabled(false);
                    G3.setEnabled(false);
                    G4.setEnabled(false);
                    G5.setEnabled(false);
                    G6.setEnabled(false);
                    G7.setEnabled(false);
                    G8.setEnabled(false);
                    G10.setEnabled(false);
                    G11.setEnabled(false);
                    G13.setEnabled(false);
                    G14.setEnabled(false);
                    G15.setEnabled(false);
                    G16.setEnabled(false);
                    G17.setEnabled(false);
                    G23.setEnabled(false);
                    G24.setEnabled(false);
                    G25.setEnabled(false);
                    G26.setEnabled(false);
                    G27.setEnabled(false);
                    G30.setEnabled(false);
                    G31.setEnabled(false);


                    act1.setEnabled(false);
                    act2.setEnabled(false);
                    act3.setEnabled(false);
                    act4.setEnabled(false);
                    act5.setEnabled(false);
                    act6.setEnabled(false);
                    act7.setEnabled(false);
                    act8.setEnabled(false);
                    act10.setEnabled(false);
                    act11.setEnabled(false);
                    act13.setEnabled(false);
                    act14.setEnabled(false);
                    act15.setEnabled(false);
                    act16.setEnabled(false);
                    act17.setEnabled(false);
                    act23.setEnabled(false);
                    act24.setEnabled(false);
                    act25.setEnabled(false);
                    act26.setEnabled(false);
                    act27.setEnabled(false);
                    act30.setEnabled(false);
                    act31.setEnabled(false);
                }else{
                    G9.setChecked(false);
                    G12.setChecked(false);
                    G19.setChecked(false);
                    G20.setChecked(false);
                    G21.setChecked(false);
                    G22.setChecked(false);
                    G28.setChecked(false);
                    G29.setChecked(false);

                    G1.setEnabled(true);
                    G2.setEnabled(true);
                    G3.setEnabled(true);
                    G4.setEnabled(true);
                    G5.setEnabled(true);
                    G6.setEnabled(true);
                    G7.setEnabled(true);
                    G8.setEnabled(true);
                    G10.setEnabled(true);
                    G11.setEnabled(true);
                    G13.setEnabled(true);
                    G14.setEnabled(true);
                    G15.setEnabled(true);
                    G16.setEnabled(true);
                    G17.setEnabled(true);
                    G23.setEnabled(true);
                    G24.setEnabled(true);
                    G25.setEnabled(true);
                    G26.setEnabled(true);
                    G27.setEnabled(true);
                    G30.setEnabled(true);
                    G31.setEnabled(true);


                    act1.setEnabled(true);
                    act2.setEnabled(true);
                    act3.setEnabled(true);
                    act4.setEnabled(true);
                    act5.setEnabled(true);
                    act6.setEnabled(true);
                    act7.setEnabled(true);
                    act8.setEnabled(true);
                    act10.setEnabled(true);
                    act11.setEnabled(true);
                    act13.setEnabled(true);
                    act14.setEnabled(true);
                    act15.setEnabled(true);
                    act16.setEnabled(true);
                    act17.setEnabled(true);
                    act23.setEnabled(true);
                    act24.setEnabled(true);
                    act25.setEnabled(true);
                    act26.setEnabled(true);
                    act27.setEnabled(true);
                    act30.setEnabled(true);
                    act31.setEnabled(true);
                }
            }

        });




        btnhasil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(final View v) {
                String _nama = txtnama.getText().toString();
                String _jeniskelamin = txtjk.getText().toString();
                String  _umur = txtumur.getText().toString();
                String _alamat = txtalamat.getText().toString();


                tv_nama.setText(txtnama.getText().toString());
                tv_jk.setText(txtjk.getText().toString());
                tv_umur.setText(txtumur.getText().toString());
                tv_alamat.setText(txtalamat.getText().toString());


                if(TextUtils.isEmpty(_nama)){
                    input((EditText) txtnama, "Nama");
                }else if (TextUtils.isEmpty(_jeniskelamin)){
                    input((EditText) txtjk, "JenisKelamin");
                }else if (TextUtils.isEmpty(_umur)){
                    input((EditText) txtumur, "Umur");
                }else if (TextUtils.isEmpty(_alamat)){
                    input((EditText) txtalamat, "Alamat");
                }else {

                    String JenisKulit = "";
                    String Persentase = "";
                    String Solusi = "";

                    //Perhitungan Rmus Metode Certainty Factor Jenis KUlit Normal
                    if (G1.isChecked() && G2.isChecked() && G3.isChecked() && G4.isChecked() && G5.isChecked() && G6.isChecked() && G11.isChecked()  && G30.isChecked()){
                        final double cfpakarG1 =  0.8;
                        final double cfpakarG2 =  0.8;
                        final double cfpakarG3 =  0.8;
                        final double cfpakarG4 =  0.8;
                        final double cfpakarG5 =  0.8;
                        final double cfpakarG6 =  0.8;
                        final double cfpakarG11 =  0.8;
                        final double cfpakarG30 =  0.4;


                        double doubleG1 = Double.parseDouble(act1.getText().toString());
                        double doubleG2 = Double.parseDouble(act2.getText().toString());
                        double doubleG3 = Double.parseDouble(act3.getText().toString());
                        double doubleG4 = Double.parseDouble(act4.getText().toString());
                        double doubleG5 = Double.parseDouble(act5.getText().toString());
                        double doubleG6 = Double.parseDouble(act6.getText().toString());
                        double doubleG11 = Double.parseDouble(act11.getText().toString());
                        double doubleG30 = Double.parseDouble(act30.getText().toString());


                        double hasilHitungG1 = cfpakarG1 * doubleG1;
                        double hasilHitungG2 = cfpakarG2 * doubleG2;
                        double hasilHitungG3 = cfpakarG3 * doubleG3;
                        double hasilHitungG4 = cfpakarG4 * doubleG4;
                        double hasilHitungG5 = cfpakarG5 * doubleG5;
                        double hasilHitungG6 = cfpakarG6 * doubleG6;
                        double hasilHitungG11 = cfpakarG11 * doubleG11;
                        double hasilHitungG30 = cfpakarG30 * doubleG30;


                        double Combine_CF1_CF2 = hasilHitungG1 + hasilHitungG2 * (1 - hasilHitungG1);
                        double Combine_CFold_CF3 = Combine_CF1_CF2 + hasilHitungG3 * (1 - Combine_CF1_CF2);
                        double Combine_CFold_CF4 = Combine_CFold_CF3 + hasilHitungG4 * (1 -Combine_CFold_CF3);
                        double Combine_CFold_CF5 = Combine_CFold_CF4 + hasilHitungG5 * (1 - Combine_CFold_CF4);
                        double Combine_CFold_CF6 = Combine_CFold_CF5 + hasilHitungG6 * (1 - Combine_CFold_CF5);
                        double Combine_CFold_CF11 = Combine_CFold_CF6 + hasilHitungG11 * (1 - Combine_CFold_CF6);
                        double Combine_CFold_CF30 = Combine_CFold_CF11+ hasilHitungG30 * (1 - Combine_CFold_CF11);

                        double hasilHitungJenisNormal = Combine_CFold_CF30 * 100;

                        persentase = hasilHitungJenisNormal;
                        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
                        dfs.setDecimalSeparator('.');
                        precision.setDecimalFormatSymbols(dfs);

                        JenisKulit += " Kulit Wajah Anda Normal";
                        jeniskulit = JenisKulit;
                        Persentase += "" + hasilHitungJenisNormal;
                        Solusi += "Gunakan Kandungan skincare yang mengandung Vitamin E, Glycerin, Hyaluranic Acid.";
                    }

                    //Perhitungan Rmus Metode Certainty Factor Jenis Kulit Berminyak
                    if (G7.isChecked() && G8.isChecked() && G9.isChecked() && G16.isChecked() && G23.isChecked() && G24.isChecked() && G25.isChecked() && G26.isChecked() && G27.isChecked()) {

                        //Nilai CF Pakar (dokter)
                        final double cfpakarG7 =  0.8;
                        final double cfpakarG8 =  0.8;
                        final double cfpakarG9 =  0.8;
                        final double cfpakarG16 =  0.8;
                        final double cfpakarG23 =  0.8;
                        final double cfpakarG24 =  0.8;
                        final double cfpakarG25 =  0.6;
                        final double cfpakarG26 =  0.8;
                        final double cfpakarG27 =  0.6;



                        double doubleG7 = Double.parseDouble(act7.getText().toString());
                        double doubleG8 = Double.parseDouble(act8.getText().toString());
                        double doubleG9 = Double.parseDouble(act9.getText().toString());
                        double doubleG16 = Double.parseDouble(act16.getText().toString());
                        double doubleG23 = Double.parseDouble(act23.getText().toString());
                        double doubleG24 = Double.parseDouble(act24.getText().toString());
                        double doubleG25 = Double.parseDouble(act25.getText().toString());
                        double doubleG26 = Double.parseDouble(act26.getText().toString());
                        double doubleG27 = Double.parseDouble(act27.getText().toString());


                        double hasilHitungG7 = cfpakarG7 * doubleG7;
                        double hasilHitungG8 = cfpakarG8 * doubleG8;
                        double hasilHitungG9 = cfpakarG9 * doubleG9;
                        double hasilHitungG16 = cfpakarG16 * doubleG16;
                        double hasilHitungG23 = cfpakarG23 * doubleG23;
                        double hasilHitungG24 = cfpakarG24 * doubleG24;
                        double hasilHitungG25 = cfpakarG25 * doubleG25;
                        double hasilHitungG26 = cfpakarG26 * doubleG26;
                        double hasilHitungG27 = cfpakarG27 * doubleG27;

                        double Combine_CF7_CF8 = hasilHitungG7 + hasilHitungG8 * (1 - hasilHitungG7);
                        double Combine_CFold_CF9 = Combine_CF7_CF8 + hasilHitungG9 * (1 - Combine_CF7_CF8);
                        double Combine_CFold_CF16 = Combine_CFold_CF9 + hasilHitungG16 * (1 -Combine_CFold_CF9);
                        double Combine_CFold_CF23 = Combine_CFold_CF16 + hasilHitungG23 * (1 - Combine_CFold_CF16);
                        double Combine_CFold_CF24 = Combine_CFold_CF23 + hasilHitungG24 * (1 - Combine_CFold_CF23);
                        double Combine_CFold_CF25 = Combine_CFold_CF24 + hasilHitungG25 * (1 - Combine_CFold_CF24);
                        double Combine_CFold_CF26 = Combine_CFold_CF25 + hasilHitungG26 * (1 - Combine_CFold_CF25);
                        double Combine_CFold_CF27 = Combine_CFold_CF26+ hasilHitungG27 * (1 - Combine_CFold_CF26);

                        double hasilHitungJenisBerminyak = Combine_CFold_CF27 * 100;
                        persentase = hasilHitungJenisBerminyak;

                        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
                        dfs.setDecimalSeparator('.');
                        precision.setDecimalFormatSymbols(dfs);

                        JenisKulit += "Kulit Wajah Anda Berminyak";
                        jeniskulit = JenisKulit;
                        Persentase += "" + hasilHitungJenisBerminyak;
                        Solusi += "Gunakan Kandungan skincare yang mengandung Green Tea, Centella Asiatica, Aloe Vera, Chamomile, Niacinamide, BHA.";
                    }
                    //Perhitungan Rmus Metode Certainty Factor Jenis KUlit kering
                    if(G1.isChecked() && G5.isChecked() && G10.isChecked() && G11.isChecked() && G12.isChecked() && G13.isChecked() && G20.isChecked() && G27.isChecked()&& G30.isChecked() && G31.isChecked()) {

                        //Nilai CF Pakar (dokter)
                        final double cfpakarG1 =  0.6;
                        final double cfpakarG5 =  0.6;
                        final double cfpakarG10 =  0.8;
                        final double cfpakarG11 =  0.6;
                        final double cfpakarG12 =  0.6;
                        final double cfpakarG13 =  0.8;
                        final double cfpakarG20 =  0.2;
                        final double cfpakarG27 =  0.8;
                        final double cfpakarG30 =  0.4;
                        final double cfpakarG31 =  0.8;


                        double doubleG1 = Double.parseDouble(act1.getText().toString());
                        double doubleG5 = Double.parseDouble(act5.getText().toString());
                        double doubleG10 = Double.parseDouble(act10.getText().toString());
                        double doubleG11 = Double.parseDouble(act11.getText().toString());
                        double doubleG12 = Double.parseDouble(act12.getText().toString());
                        double doubleG13 = Double.parseDouble(act13.getText().toString());
                        double doubleG20 = Double.parseDouble(act20.getText().toString());
                        double doubleG27 = Double.parseDouble(act27.getText().toString());
                        double doubleG30 = Double.parseDouble(act30.getText().toString());
                        double doubleG31 = Double.parseDouble(act31.getText().toString());


                        double hasilHitungG1 = cfpakarG1 * doubleG1;
                        double hasilHitungG5 = cfpakarG5 * doubleG5;
                        double hasilHitungG10 = cfpakarG10 * doubleG10;
                        double hasilHitungG11 = cfpakarG11 * doubleG11;
                        double hasilHitungG12 = cfpakarG12 * doubleG12;
                        double hasilHitungG13 = cfpakarG13 * doubleG13;
                        double hasilHitungG20 = cfpakarG20 * doubleG20;
                        double hasilHitungG27 = cfpakarG27 * doubleG27;
                        double hasilHitungG30 = cfpakarG30 * doubleG30;
                        double hasilHitungG31 = cfpakarG31 * doubleG31;

                        double Combine_CF1_CF5 = hasilHitungG1 + hasilHitungG5 * (1 - hasilHitungG1);
                        double Combine_CFold_CF10 = Combine_CF1_CF5 + hasilHitungG10 * (1 - Combine_CF1_CF5);
                        double Combine_CFold_CF11 = Combine_CFold_CF10 + hasilHitungG11 * (1 -Combine_CFold_CF10);
                        double Combine_CFold_CF12 = Combine_CFold_CF11 + hasilHitungG12 * (1 - Combine_CFold_CF11);
                        double Combine_CFold_CF13 = Combine_CFold_CF12 + hasilHitungG13 * (1 - Combine_CFold_CF12);
                        double Combine_CFold_CF20 = Combine_CFold_CF13 + hasilHitungG20 * (1 - Combine_CFold_CF13);
                        double Combine_CFold_CF27 = Combine_CFold_CF20+ hasilHitungG27 * (1 - Combine_CFold_CF20);
                        double Combine_CFold_CF30 = Combine_CFold_CF27+ hasilHitungG30 * (1 - Combine_CFold_CF27);
                        double Combine_CFold_CF31 = Combine_CFold_CF30+ hasilHitungG31 * (1 - Combine_CFold_CF30);

                        double hasilHitungJenisKering = Combine_CFold_CF31 * 100;
                        persentase = hasilHitungJenisKering;

                        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
                        dfs.setDecimalSeparator('.');
                        precision.setDecimalFormatSymbols(dfs);

                        JenisKulit += "Kulit Wajah Anda Kering";
                        jeniskulit = JenisKulit;
                        Persentase += "" + hasilHitungJenisKering;
                        Solusi += "Gunakan Kandungan skincare yang mengandung Vitamin E, Glycerin, Aloe Vera, Ceramides, Hyaluranic Acid.";
                    }
                    //Perhitungan Rmus Metode Certainty Factor Jenis Kulit Kombinasi
                    if (G7.isChecked() && G14.isChecked() && G15.isChecked() && G16.isChecked() && G17.isChecked() && G23.isChecked() && G25.isChecked() && G26.isChecked()) {

                        //Nilai CF Pakar (dokter)
                        final double cfpakarG7 =  0.6;
                        final double cfpakarG14 =  0.8;
                        final double cfpakarG15 =  0.8;
                        final double cfpakarG16 =  0.4;
                        final double cfpakarG17 =  0.8;
                        final double cfpakarG23 =  0.8;
                        final double cfpakarG25 =  0.6;
                        final double cfpakarG26 =  0.6;




                        double doubleG7 = Double.parseDouble(act7.getText().toString());
                        double doubleG14 = Double.parseDouble(act14.getText().toString());
                        double doubleG15 = Double.parseDouble(act15.getText().toString());
                        double doubleG16 = Double.parseDouble(act16.getText().toString());
                        double doubleG17 = Double.parseDouble(act17.getText().toString());
                        double doubleG23 = Double.parseDouble(act23.getText().toString());
                        double doubleG25 = Double.parseDouble(act25.getText().toString());
                        double doubleG26 = Double.parseDouble(act26.getText().toString());


                        double hasilHitungG7 = cfpakarG7 * doubleG7;
                        double hasilHitungG14 = cfpakarG14 * doubleG14;
                        double hasilHitungG15 = cfpakarG15 * doubleG15;
                        double hasilHitungG16 = cfpakarG16 * doubleG16;
                        double hasilHitungG17 = cfpakarG17 * doubleG17;
                        double hasilHitungG23 = cfpakarG23 * doubleG23;
                        double hasilHitungG25 = cfpakarG25 * doubleG25;
                        double hasilHitungG26 = cfpakarG26 * doubleG26;


                        double Combine_CF7_CF14 = hasilHitungG7 + hasilHitungG14 * (1 - hasilHitungG7);
                        double Combine_CFold_CF15 = Combine_CF7_CF14 + hasilHitungG15 * (1 - Combine_CF7_CF14 );
                        double Combine_CFold_CF16 = Combine_CFold_CF15 + hasilHitungG16 * (1 -Combine_CFold_CF15);
                        double Combine_CFold_CF17 = Combine_CFold_CF16 + hasilHitungG17 * (1 - Combine_CFold_CF16);
                        double Combine_CFold_CF23 = Combine_CFold_CF17 + hasilHitungG23 * (1 - Combine_CFold_CF17);
                        double Combine_CFold_CF25 = Combine_CFold_CF23 + hasilHitungG25 * (1 - Combine_CFold_CF23);
                        double Combine_CFold_CF26= Combine_CFold_CF25 + hasilHitungG26 * (1 - Combine_CFold_CF25);


                        double hasilHitungJenisKombinasi = Combine_CFold_CF26 * 100;
                        persentase = hasilHitungJenisKombinasi;

                        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
                        dfs.setDecimalSeparator('.');
                        precision.setDecimalFormatSymbols(dfs);

                        JenisKulit += "Kulit Wajah Anda Kombinasi";
                        jeniskulit = JenisKulit;
                        Persentase += "" + hasilHitungJenisKombinasi;
                        Solusi += "Gunakan Kandungan skincare yang mengandung Salicilic Acid, Chamomile, Peptited, Niacinamide, Hyaluranic Acid, AHA dan BHA.";
                    }
                    //Perhitungan Rmus Metode Certainty Factor Jenis KUlit sensitif
                    if (G9.isChecked() && G12.isChecked() && G18.isChecked() && G19.isChecked() && G20.isChecked()&& G21.isChecked() && G22.isChecked()  && G28.isChecked() && G29.isChecked()) {

                        //Nilai CF Pakar (dokter)
                        final double cfpakarG9 =  0.8;
                        final double cfpakarG20 =  0.8;
                        final double cfpakarG12 =  0.8;
                        final double cfpakarG18 =  0.8;
                        final double cfpakarG19 =  0.8;
                        final double cfpakarG22 =  0.8;
                        final double cfpakarG21=  0.6;
                        final double cfpakarG28 =  0.6;
                        final double cfpakarG29 =  0.6;



                        double doubleG9= Double.parseDouble(act9.getText().toString());
                        double doubleG12 = Double.parseDouble(act12.getText().toString());
                        double doubleG18 = Double.parseDouble(act18.getText().toString());
                        double doubleG19 = Double.parseDouble(act19.getText().toString());
                        double doubleG20 = Double.parseDouble(act20.getText().toString());
                        double doubleG21 = Double.parseDouble(act21.getText().toString());
                        double doubleG22 = Double.parseDouble(act22.getText().toString());
                        double doubleG28 = Double.parseDouble(act28.getText().toString());
                        double doubleG29 = Double.parseDouble(act29.getText().toString());


                        double hasilHitungG9 = cfpakarG9 * doubleG9;
                        double hasilHitungG12= cfpakarG12 * doubleG12;
                        double hasilHitungG18 = cfpakarG18 * doubleG18;
                        double hasilHitungG19 = cfpakarG19 * doubleG19;
                        double hasilHitungG20 = cfpakarG20 * doubleG20;
                        double hasilHitungG21 = cfpakarG21 * doubleG21;
                        double hasilHitungG22 = cfpakarG22 * doubleG22;
                        double hasilHitungG28 = cfpakarG28* doubleG28;
                        double hasilHitungG29 = cfpakarG29 * doubleG29;


                        double Combine_CF9_CF12 = hasilHitungG9 + hasilHitungG12 * (1 - hasilHitungG9);
                        double Combine_CFold_CF18 = Combine_CF9_CF12 + hasilHitungG18 * (1 - Combine_CF9_CF12 );
                        double Combine_CFold_CF19 = Combine_CFold_CF18 + hasilHitungG19 * (1 -Combine_CFold_CF18);
                        double Combine_CFold_CF20 = Combine_CFold_CF19 + hasilHitungG20 * (1 - Combine_CFold_CF19);
                        double Combine_CFold_CF21 = Combine_CFold_CF20 + hasilHitungG21 * (1 - Combine_CFold_CF20);
                        double Combine_CFold_CF22 = Combine_CFold_CF21 + hasilHitungG22 * (1 - Combine_CFold_CF21);
                        double Combine_CFold_CF28= Combine_CFold_CF22 + hasilHitungG28 * (1 - Combine_CFold_CF22);
                        double Combine_CFold_CF29 = Combine_CFold_CF28+ hasilHitungG29 * (1 - Combine_CFold_CF28);


                        double hasilHitungJenisSensitif = Combine_CFold_CF29 * 100;
                        persentase = hasilHitungJenisSensitif;

                        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
                        dfs.setDecimalSeparator('.');
                        precision.setDecimalFormatSymbols(dfs);

                        JenisKulit += "Kulit Wajah Anda Sensitif";
                        jeniskulit = JenisKulit;
                        Persentase += "" + hasilHitungJenisSensitif;
                        Solusi += "Gunakan Kandungan skincare yang mengandung Bahan Chamomile, Allantoin, Petrolatum, Dimithicone, Hyaluronic Acid, Ceramide, Niacinamide, Micro Zinc Oxide. .";
                    }

                    tv_jeniskulit.setText(""+JenisKulit+" ");
                    tv_persentase.setText(""+Persentase+ "%");
                    tv_Solusi.setText(""+Solusi+"");
                    {
                        DatabaseReference database = FirebaseDatabase.getInstance().getReference("diagnosa");
                        /*Mengambil Uid dari firebase pada firebaseUser*/
                        String userId = firebaseUser.getUid();
                        database.child(userId).push().setValue(new mahasiswa(_nama, _jeniskelamin, _umur, _alamat, jeniskulit, Double.parseDouble(precision.format(persentase)), Solusi )).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(v.getContext(), "Data telah Tersimpan",Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener(){
                            @Override
                            public void onFailure(@NonNull Exception e){
                                Toast.makeText(v.getContext(), "Data Gagal Tersimpan",Toast.LENGTH_SHORT).show();
                            }
                        });

                    }}



            }

        });

        return v;
    }

    @Override
    public void onStart(){
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null){

            Objects.requireNonNull(dialog.getWindow()).setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
    }

    private void input(EditText txt, String s ){
        txt.setError(s+" Tidak Boleh Kosong");
        txt.requestFocus();
    }
}
