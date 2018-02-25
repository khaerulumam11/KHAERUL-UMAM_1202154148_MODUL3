package com.example.khaerulumam.khaerulumam_1202154148_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {

    private TextView a,b,d;
    private ImageView c,e;

    int test = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //melakukan inisiasi pada TextView dan Gambar
        a = (TextView) findViewById(R.id.namajudul);
        b = (TextView) findViewById(R.id.deskripsi);

        c = (ImageView) findViewById(R.id.gambar);

        d = (TextView) findViewById(R.id.angka);

        e = (ImageView) findViewById(R.id.baterai);

        //mengambil data yang di kirimkan dari Intent
        Intent v = getIntent();

        String nama = v.getStringExtra("judul");
        Integer desk = v.getIntExtra("komposisi",0);
        Integer gambar = v.getIntExtra("gambar",0);

        //melakukan set nama sesuai dengan apa yg kita dapatkan dari intent diatas
        a.setText(nama);

        b.setText(desk);

        c.setImageResource(gambar);
    }


    public void minus(View view) {
        // agar saat tombol di klik maka akan berkurang
     test--;
     cekIsi();
    }

    public void plus(View view) {
        // agar saat tombol di klik maka akan bertambah
        test++;
        cekIsi();
    }

    private void cekIsi() {
        if (test > 6){
            //menampilkan angka saat tombol di klik
            d.setText("7 L");
            //menampilkan gambar dengan isi 100%
            e.setImageResource(R.drawable.baterai_full);
            Toast.makeText(this,"Air Sudah Full",Toast.LENGTH_LONG).show();
        }
        //jika angka kurang dari 0 atau min maka akan muncul pesan jika air sedikit
        if (test == 6){
            //menampilkan angka saat tombol di klik
            d.setText("6 L");
            //menampilkan gambar dengan isi 90%
            e.setImageResource(R.drawable.baterai_90);
        }
        if (test == 5){
            //menampilkan angka saat tombol di klik
            d.setText("5 L");
            //menampilkan gambar dengan isi 80%
            e.setImageResource(R.drawable.baterai_80);
        }
        if (test == 4){
            //menampilkan angka saat tombol di klik
            d.setText("4 L");
            //menampilkan gambar dengan isi 60%
            e.setImageResource(R.drawable.baterai_60);
        }
        if (test == 3){
            //menampilkan angka saat tombol di klik
            d.setText("3 L");
            //menampilkan gambar dengan isi 50%
            e.setImageResource(R.drawable.baterai_50);
        }
        if (test == 2){
            //menampilkan angka saat tombol di klik
            d.setText("2 L");
            //menampilkan gambar dengan isi 30%
            e.setImageResource(R.drawable.baterai_30);
        }
        if (test==1){
            //menampilkan angka saat tombol di klik
            d.setText("1 L");
            //menampilkan gambar dengan isi 20%
            e.setImageResource(R.drawable.baterai_20);
        }
        if (test == 0){
            //menampilkan angka saat tombol di klik
            d.setText("0 L");
            //menampilkan gambar dengan isi 20%
            e.setImageResource(R.drawable.baterai_20);
        }
        if (test < 0){
            //menampilkan angka saat tombol di klik
            d.setText("-1 L");
            //menampilkan gambar dengan isi 20%
            e.setImageResource(R.drawable.baterai_20);
            Toast.makeText(this,"Air Sedikit",Toast.LENGTH_LONG).show();
        }
    }


}
