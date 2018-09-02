package com.example.nemo1.shop_app.shop_core.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.entity.eMusic;

import java.util.List;

public class adapter_music extends RecyclerView.Adapter<adapter_music.ViewHolder>{

    private Context context;
    private List<eMusic> eMusicList;

    public adapter_music(Context context, List<eMusic> eMusicList) {
        this.context = context;
        this.eMusicList = eMusicList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cardview_music, parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        eMusic eMusic = eMusicList.get(position);
        holder.img_music.setImageResource(eMusic.getImgM());
        holder.name_music.setText(eMusic.getNameM());
        holder.singer_music.setText(eMusic.getSingerM());

    }

    @Override
    public int getItemCount() {
        return new mMusic().geteMusicList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_music;
        private TextView name_music, singer_music;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_music = itemView.findViewById(R.id.img_music);
            name_music = itemView.findViewById(R.id.name_music);
            singer_music = itemView.findViewById(R.id.singer_music);
        }
    }
}
