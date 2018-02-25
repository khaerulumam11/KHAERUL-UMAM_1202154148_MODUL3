package com.example.khaerulumam.khaerulumam_1202154148_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Umam on 2/22/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<String> rvData,rvDesk;
    private ArrayList<Integer> gambar;

    public Adapter(ArrayList<String> inputData, ArrayList<String> dataDesk, ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvDesk = dataDesk;
        gambar = gmbr;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String dan Integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;
        private CardView hmm;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();
            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            hmm = v.findViewById(R.id.cardview);
            //agar isi dari array nya dapat pindah layout dengan membawa data sesuai dibawah
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailMenu.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.aqua);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.amidis);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.ades);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.cleo);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.club);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.equil);
                            context.startActivity(intent);
                            break;
                        case 6 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.evian);
                            context.startActivity(intent);
                            break;
                        case 7 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.leminerale);
                            context.startActivity(intent);
                            break;
                        case 8 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.nestle);
                            context.startActivity(intent);
                            break;

                        case 9 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.pristine);
                            context.startActivity(intent);
                            break;

                        case 10 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("deskripsi",rvDesk.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            intent.putExtra("komposisi",R.string.vit);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String desk = rvDesk.get(position);
        final Integer test = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(desk);
        holder.hmm.setBackgroundResource(test);

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }

}
