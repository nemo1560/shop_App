package com.example.nemo1.cardview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eSong;

import java.util.List;

public class adapterCardView extends RecyclerView.Adapter<adapterCardView.MyViewHolder>{
    private Context context;
    private List<eSong> eSongList;

    public adapterCardView(Context context, List<eSong> eSongList) {
        this.context = context;
        this.eSongList = eSongList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        eSong eSong = eSongList.get(position);
        holder.imgCardView.setImageResource(eSong.getImgSong());
        holder.textCardView.setText(eSong.getNameSong());
    }

    @Override
    public int getItemCount() {
        return eSongList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCardView;
        private TextView textCardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCardView = itemView.findViewById(R.id.imgCardView);
            textCardView = itemView.findViewById(R.id.textCardView);
        }
    }
}
