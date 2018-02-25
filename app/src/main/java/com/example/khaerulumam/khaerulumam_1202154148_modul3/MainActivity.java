package com.example.khaerulumam.khaerulumam_1202154148_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> datadesk;
    private ArrayList<Integer> gambar,deskripsi;
    private TextView a,b;

    //Daftar Menu Makanan
    private String[] nama = {"Aqua", "Amidis","Ades","Cleo","Club","Equil",
            "Evian","LeMinerale","Nestle","Pristine","Vit"};
    //Daftar deskripsi
    private String[] desk = {"Ini adalah minuman bermerk Aqua",
            "Ini adalah minuman bermerk Amidis",
            "Ini adalah minuman bermerk Ades",
            "Ini adalah minuman bermerk Cleo",
            "Ini adalah minuman bermerk Club",
            "Ini adalah minuman bermerk Equil",
            "Ini adalah minuman bermerk Evian",
            "Ini adalah minuman bermerk LeMinerale",
            "Ini adalah minuman bermerk Nestle",
            "Ini adalah minuman bermerk Pristine",
            "Ini adalah minuman bermerk Vit"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.aqua, R.drawable.amidis,R.drawable.ades,R.drawable.cleo,R.drawable.club,
            R.drawable.equil,R.drawable.evian,R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};
//
//    //Daftar deskripsi lengkap
//    private int[] test = {R.string.aqua, R.string.amidis,R.string.ades,R.string.cleo,R.string.club,
//            R.string.equil,R.string.evian,R.string.leminerale,R.string.nestle,R.string.pristine,R.string.vit};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mensetting toolbar yang akan muncul di atas dengan nama List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbarlist);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Merk");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        datadesk = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();


        //melakukan inisiasi pada recyclerview
        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new Adapter(dataMenu,datadesk,gambar);
        rvView.setAdapter(adapter);

        //agar saat di landscape bentuknya menjadi grid
        int grid = getResources().getInteger(R.integer.grid_column_count);
        rvView.setLayoutManager(new GridLayoutManager(this,grid));
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<nama.length; w++){
            dataMenu.add(nama[w]);
            datadesk.add(desk[w]);
            gambar.add(Gambar[w]);
        }
    }
}
