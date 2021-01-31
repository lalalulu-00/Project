package com.android.sistempakar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_Skin_Check extends AppCompatActivity {


    Button btnProses;
    TextView tvOutput;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15, cb16, cb17, cb18, cb19, cb20;
    AutoCompleteTextView act1, act2, act3, act4, act5, act6, act7, act8, act9, act10, act11, act12, act13, act14, act15, act16, act17, act18, act19, act20;


    String[] nilaikeyakinanG1 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG2 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG3 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG4 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG5 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG6 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG7 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG8 = {"","0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG9 = {"",  "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG10 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG11 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG12 = {"","0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG13 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG14 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG15 = {"",  "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG16 = {"",  "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG17 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG18 = {"", "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG19 = {"",  "0.2", "0.4", "0.6", "0.8", "1"};
    String[] nilaikeyakinanG20 = {"", "0.2", "0.4", "0.6", "0.8", "1"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__skin__check);


        btnProses = (Button)findViewById(R.id.btnhasil);
        tvOutput = (TextView) findViewById(R.id.Output);

        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb3 = (CheckBox)findViewById(R.id.checkBox5);
        cb4 = (CheckBox)findViewById(R.id.checkBox3);
        cb5 = (CheckBox)findViewById(R.id.checkBox7);
        cb6 = (CheckBox)findViewById(R.id.checkBox8);
        cb7 = (CheckBox)findViewById(R.id.checkBox9);
        cb8 = (CheckBox)findViewById(R.id.checkBox10);
        cb9 = (CheckBox)findViewById(R.id.checkBox11);
        cb10 = (CheckBox)findViewById(R.id.checkBox12);
        cb11 = (CheckBox)findViewById(R.id.checkBox13);
        cb12 = (CheckBox)findViewById(R.id.checkBox14);
        cb13 = (CheckBox)findViewById(R.id.checkBox15);
        cb14 = (CheckBox)findViewById(R.id.checkBox16);
        cb15 = (CheckBox)findViewById(R.id.checkBox17);
        cb16 = (CheckBox)findViewById(R.id.checkBox18);
        cb17 = (CheckBox)findViewById(R.id.checkBox20);
        cb18 = (CheckBox)findViewById(R.id.checkBox21);
        cb19 = (CheckBox)findViewById(R.id.checkBox22);
        cb20 = (CheckBox)findViewById(R.id.checkBox23);

        act1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        act2 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        act3 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView15);
        act4 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        act5 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);
        act6 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView6);
        act7 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView7);
        act8 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView8);
        act9 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView9);
        act10 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView10);
        act11 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView11);
        act12 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView12);
        act13 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView13);
        act14 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView20);
        act15 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView21);
        act16 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView22);
        act17 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView23);
        act18 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView24);
        act19 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView25);
        act20 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView26);


        final ArrayAdapter<String> adapterG1 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG1);
        act1.setThreshold(1);
        act1.setAdapter(adapterG1);

        final ArrayAdapter<String> adapterG2 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG2);
        act2.setThreshold(1);
        act2.setAdapter(adapterG2);

        final ArrayAdapter<String> adapterG3 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG3);
        act3.setThreshold(1);
        act3.setAdapter(adapterG3);

        final ArrayAdapter<String> adapterG4 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG4);
        act4.setThreshold(1);
        act4.setAdapter(adapterG4);

        final ArrayAdapter<String> adapterG5 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG5);
        act5.setThreshold(1);
        act5.setAdapter(adapterG5);

        final ArrayAdapter<String> adapterG6 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG6);
        act6.setThreshold(1);
        act6.setAdapter(adapterG6);

        final ArrayAdapter<String> adapterG7 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG7);
        act7.setThreshold(1);
        act7.setAdapter(adapterG7);

        final ArrayAdapter<String> adapterG8 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG8);
        act8.setThreshold(1);
        act8.setAdapter(adapterG8);

        final ArrayAdapter<String> adapterG9 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG9);
        act9.setThreshold(1);
        act9.setAdapter(adapterG9);

        final ArrayAdapter<String> adapterG10 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG10);
        act10.setThreshold(1);
        act10.setAdapter(adapterG10);

        final ArrayAdapter<String> adapterG11 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG11);
        act11.setThreshold(1);
        act11.setAdapter(adapterG11);

        final ArrayAdapter<String> adapterG12 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG12);
        act12.setThreshold(1);
        act12.setAdapter(adapterG12);

        final ArrayAdapter<String> adapterG13 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG13);
        act13.setThreshold(1);
        act13.setAdapter(adapterG13);

        final ArrayAdapter<String> adapterG14 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG14);
        act14.setThreshold(1);
        act14.setAdapter(adapterG14);

        final ArrayAdapter<String> adapterG15 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG15);
        act15.setThreshold(1);
        act15.setAdapter(adapterG15);

        final ArrayAdapter<String> adapterG16 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG16);
        act16.setThreshold(1);
        act16.setAdapter(adapterG16);

        final ArrayAdapter<String> adapterG17 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG17);
        act17.setThreshold(1);
        act17.setAdapter(adapterG17);

        final ArrayAdapter<String> adapterG18 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG18);
        act18.setThreshold(1);
        act18.setAdapter(adapterG18);

        final ArrayAdapter<String> adapterG19 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG19);
        act19.setThreshold(1);
        act19.setAdapter(adapterG19);

        final ArrayAdapter<String> adapterG20 = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, nilaikeyakinanG20);
        act20.setThreshold(1);
        act20.setAdapter(adapterG20);

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 1").setAdapter(adapterG1, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 2").setAdapter(adapterG2, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 3").setAdapter(adapterG3, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 4").setAdapter(adapterG4, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 5").setAdapter(adapterG5, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 6").setAdapter(adapterG6, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 7").setAdapter(adapterG7, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 8").setAdapter(adapterG8, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 9").setAdapter(adapterG9, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 10").setAdapter(adapterG10, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 11").setAdapter(adapterG11, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 12").setAdapter(adapterG12, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 13").setAdapter(adapterG13, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 14").setAdapter(adapterG14, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 15").setAdapter(adapterG15, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 16").setAdapter(adapterG16, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 17").setAdapter(adapterG17, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act17.setText(nilaikeyakinanG17[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 18").setAdapter(adapterG18, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act18.setText(nilaikeyakinanG18[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        act19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 19").setAdapter(adapterG19, new DialogInterface.OnClickListener() {
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
                new AlertDialog.Builder(Menu_Skin_Check.this).setTitle("Pilih Nilai Gejala 20").setAdapter(adapterG20, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        act20.setText(nilaikeyakinanG20[which].toString());
                        dialog.dismiss();
                    }
                }).create().show();
            }
        });

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String JenisKulit = "Jenis Kulit : ";
                String Persentase = "Persentase Kepercayaan :";

                //METODE FORWARD Chaining
                // AND && //
                if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked() && cb6.isChecked() && cb11.isChecked()) {

                    //Nilai CF Pakar (dokter)
                    double cfpakarG1 = 0.8;
                    double cfpakarG2 = 0.8;
                    double cfpakarG3 = 0.8;
                    double cfpakarG4 = 0.8;
                    double cfpakarG5 = 0.8;
                    double cfpakarG6 = 0.8;
                    double cfpakarG11 = 0.8;

                    //Nilai Input user / Konsultan
                    double doubleG1 = Double.parseDouble(act1.getText().toString());
                    double doubleG2 = Double.parseDouble(act2.getText().toString());
                    double doubleG3 = Double.parseDouble(act3.getText().toString());
                    double doubleG4 = Double.parseDouble(act4.getText().toString());
                    double doubleG5 = Double.parseDouble(act5.getText().toString());
                    double doubleG6 = Double.parseDouble(act6.getText().toString());
                    double doubleG11 = Double.parseDouble(act11.getText().toString());

                    //METODE CERTAINTY FACTOR
                    double hasilHitungG1 = cfpakarG1 * doubleG1;
                    double hasilHitungG2 = cfpakarG2 * doubleG2;
                    double hasilHitungG3 = cfpakarG3 * doubleG3;
                    double hasilHitungG4 = cfpakarG4 * doubleG4;
                    double hasilHitungG5 = cfpakarG5 * doubleG5;
                    double hasilHitungG6 = cfpakarG6 * doubleG6;
                    double hasilHitungG11 = cfpakarG11 * doubleG11;

                    double Combine_CF1_CF2 = hasilHitungG1 + hasilHitungG2 * (1 - hasilHitungG1);
                    double Combine_CFold_CF3 = Combine_CF1_CF2 + hasilHitungG3 * (1 - Combine_CF1_CF2);
                    double Combine_CFold_CF4 = Combine_CFold_CF3 + hasilHitungG4 * (1 - Combine_CFold_CF3);
                    double Combine_CFold_CF5 = Combine_CFold_CF4 + hasilHitungG5 * (1 - Combine_CFold_CF4);
                    double Combine_CFold_CF6 = Combine_CFold_CF5 + hasilHitungG6 * (1 - Combine_CFold_CF5);
                    double Combine_CFold_CF11 = Combine_CFold_CF6 + hasilHitungG11 * (1 - Combine_CFold_CF6);

                    String hasilHitungJenisNormal = String.valueOf((Combine_CFold_CF11 * 100));

                    JenisKulit += "\nWajah Anda Normal";
                    Persentase += "\n" + hasilHitungJenisNormal;
                }

                //METODE FORWARD Chaining
                if (cb7.isChecked() && cb8.isChecked() && cb9.isChecked() && cb16.isChecked()) {

                    //Nilai CF Pakar (dokter)
                    double cfpakarG7 = 0.8;
                    double cfpakarG8 = 0.8;
                    double cfpakarG9 = 0.8;
                    double cfpakarG16 = 0.8;

                    //Nilai Input user / Konsultan
                    double doubleG7 = Double.parseDouble(act7.getText().toString());
                    double doubleG8 = Double.parseDouble(act8.getText().toString());
                    double doubleG9 = Double.parseDouble(act9.getText().toString());
                    double doubleG16 = Double.parseDouble(act16.getText().toString());

                    //METODE CERTAINTY FACTOR
                    double hasilHitungG7 = cfpakarG7 * doubleG7;
                    double hasilHitungG8 = cfpakarG8 * doubleG8;
                    double hasilHitungG9 = cfpakarG9 * doubleG9;
                    double hasilHitungG16 = cfpakarG16 * doubleG16;


                    double Combine_CF7_CF8 = hasilHitungG7 + hasilHitungG8 * (1 - hasilHitungG7);
                    double Combine_CFold_CF9 = Combine_CF7_CF8 + hasilHitungG9 * (1 - Combine_CF7_CF8);
                    double Combine_CFold_CF16 = Combine_CFold_CF9 + hasilHitungG16 * (1 - Combine_CFold_CF9);

                    String hasilHitungJenisBerminyak = String.valueOf((Combine_CFold_CF16 * 100));

                    JenisKulit += "\nWajah Anda Berminyak";
                    Persentase += "\n" + hasilHitungJenisBerminyak;
                }

                //METODE FORWARD Chaining
                if (cb1.isChecked() && cb5.isChecked() && cb10.isChecked() && cb11.isChecked() && cb12.isChecked() && cb13.isChecked()) {

                    //Nilai CF Pakar (dokter)
                    double cfpakarG1 = 0.6;
                    double cfpakarG5 = 0.6;
                    double cfpakarG10 = 0.8;
                    double cfpakarG11 = 0.6;
                    double cfpakarG12 = 0.6;
                    double cfpakarG13 = 0.8;

                    //Nilai Input user / Konsultan
                    double doubleG1 = Double.parseDouble(act1.getText().toString());
                    double doubleG5 = Double.parseDouble(act5.getText().toString());
                    double doubleG10 = Double.parseDouble(act10.getText().toString());
                    double doubleG11 = Double.parseDouble(act11.getText().toString());
                    double doubleG12 = Double.parseDouble(act12.getText().toString());
                    double doubleG13 = Double.parseDouble(act13.getText().toString());

                    //METODE CERTAINTY FACTOR
                    double hasilHitungG1 = cfpakarG1 * doubleG1;
                    double hasilHitungG5 = cfpakarG5 * doubleG5;
                    double hasilHitungG10 = cfpakarG10 * doubleG10;
                    double hasilHitungG11 = cfpakarG11 * doubleG11;
                    double hasilHitungG12 = cfpakarG12 * doubleG12;
                    double hasilHitungG13 = cfpakarG13 * doubleG13;


                    double Combine_CF1_CF5 = hasilHitungG1 + hasilHitungG5 * (1 - hasilHitungG1);
                    double Combine_CFold_CF10 = Combine_CF1_CF5 + hasilHitungG10 * (1 - Combine_CF1_CF5);
                    double Combine_CFold_CF11 = Combine_CFold_CF10 + hasilHitungG11 * (1 - Combine_CFold_CF10);
                    double Combine_CFold_CF12 = Combine_CFold_CF11 + hasilHitungG12 * (1 - Combine_CFold_CF11);
                    double Combine_CFold_CF13 = Combine_CFold_CF12 + hasilHitungG13 * (1 - Combine_CFold_CF12);


                    String hasilHitungJenisKering = String.valueOf((Combine_CFold_CF13 * 100));

                    JenisKulit += "\nWajah Anda Kering";
                    Persentase += "\n" + hasilHitungJenisKering;
                }

                //METODE FORWARD Chaining
                if (cb7.isChecked() && cb14.isChecked() && cb15.isChecked() && cb16.isChecked() && cb17.isChecked()) {

                    //Nilai CF Pakar (dokter)
                    double cfpakarG7 = 0.6;
                    double cfpakarG14 = 0.4;
                    double cfpakarG15 = 0.6;
                    double cfpakarG16 = 0.4;
                    double cfpakarG17 = 0.6;


                    //Nilai Input user / Konsultan
                    double doubleG7 = Double.parseDouble(act7.getText().toString());
                    double doubleG14 = Double.parseDouble(act14.getText().toString());
                    double doubleG15 = Double.parseDouble(act15.getText().toString());
                    double doubleG16 = Double.parseDouble(act16.getText().toString());
                    double doubleG17 = Double.parseDouble(act17.getText().toString());


                    //METODE CERTAINTY FACTOR
                    double hasilHitungG7 = cfpakarG7 * doubleG7;
                    double hasilHitungG14 = cfpakarG14 * doubleG14;
                    double hasilHitungG15 = cfpakarG15 * doubleG15;
                    double hasilHitungG16 = cfpakarG16 * doubleG16;
                    double hasilHitungG17 = cfpakarG17 * doubleG17;


                    double Combine_CF7_CF14 = hasilHitungG7 + hasilHitungG14* (1 - hasilHitungG7);
                    double Combine_CFold_CF15 = Combine_CF7_CF14 + hasilHitungG15 * (1 - Combine_CF7_CF14);
                    double Combine_CFold_CF16 = Combine_CFold_CF15 + hasilHitungG16 * (1 - Combine_CFold_CF15);
                    double Combine_CFold_CF17 = Combine_CFold_CF16 + hasilHitungG17 * (1 - Combine_CFold_CF16);


                    String hasilHitungJenisKombinasi = String.valueOf((Combine_CFold_CF17 * 100));

                    JenisKulit += "\nWajah Anda Kombinasi";
                    Persentase += "\n" + hasilHitungJenisKombinasi;
                }

                //METODE FORWARD Chaining
                if (cb12.isChecked() && cb18.isChecked() && cb19.isChecked() && cb20.isChecked()) {

                    //Nilai CF Pakar (dokter)
                    double cfpakarG12 = 0.8;
                    double cfpakarG18 = 0.8;
                    double cfpakarG19 = 0.8;
                    double cfpakarG20 = 0.8;

                    //Nilai Input user / Konsultan
                    double doubleG12 = Double.parseDouble(act12.getText().toString());
                    double doubleG18 = Double.parseDouble(act18.getText().toString());
                    double doubleG19 = Double.parseDouble(act19.getText().toString());
                    double doubleG20 = Double.parseDouble(act20.getText().toString());

                    //METODE CERTAINTY FACTOR
                    double hasilHitungG12 = cfpakarG12 * doubleG12;
                    double hasilHitungG18 = cfpakarG18 * doubleG18;
                    double hasilHitungG19 = cfpakarG19 * doubleG19;
                    double hasilHitungG20 = cfpakarG20 * doubleG20;


                    double Combine_CF12_CF18 = hasilHitungG12 + hasilHitungG18 * (1 - hasilHitungG12);
                    double Combine_CFold_CF19 = Combine_CF12_CF18 + hasilHitungG19 * (1 - Combine_CF12_CF18);
                    double Combine_CFold_CF20 = Combine_CFold_CF19 + hasilHitungG20 * (1 - Combine_CFold_CF19);


                    String hasilHitungJenisSensitif = String.valueOf((Combine_CFold_CF20 * 100));

                    JenisKulit += "\nWajah Anda Sensitif";
                    Persentase += "\n" + hasilHitungJenisSensitif;
                }

                tvOutput.setText(""+JenisKulit+ ""+Persentase+ " %");

            }
        });

    }
}