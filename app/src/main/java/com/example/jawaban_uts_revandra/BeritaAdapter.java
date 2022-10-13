package com.example.jawaban_uts_revandra;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.ViewHolder> {
    private final ArrayList<Berita> value;
//    private Context context;
    private LayoutInflater inflater;
    public BeritaAdapter(Context context, ArrayList<Berita> listBerita) {
        this.value = listBerita;
//        this.context = context;
        this.inflater = LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public BeritaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.itemrvberita, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BeritaAdapter.ViewHolder holder, final int position) {
        final Berita berita = value.get(position);
        holder.txtName.setText(berita.judul);
        holder.txtTanggal.setText(berita.rilis.toString());

        holder.IMG.setImageResource(Berita.kumpulanGambar[berita.picture]);
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailBerita.class);
            String judul = berita.judul;
            String tanggal = berita.rilis.toString();
            int noGambar = berita.picture;
            String desc = berita.content;


        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtTanggal;
        ImageView IMG;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtTanggal = itemView.findViewById(R.id.txt_tanggal);
            IMG = itemView.findViewById(R.id.IMG);
        }
    }
}
