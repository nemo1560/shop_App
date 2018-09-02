package com.example.nemo1.view_customview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eSong;

import java.util.List;

public class songAdapter extends ArrayAdapter<eSong>{

    private List<eSong> eSongList;
    private Context context;
    private int resource;

    public songAdapter(@NonNull Context context, int resource, @NonNull List<eSong> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eSongList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(this.resource,parent,false);
        ImageView imageView = convertView.findViewById(R.id.img_album);
        TextView textView1 = convertView.findViewById(R.id.songName);
        TextView textView2 = convertView.findViewById(R.id.singer);
        TextView textView3 = convertView.findViewById(R.id.time);
        ImageView imageView1 = convertView.findViewById(R.id.imgArrow);

        eSong eSong = eSongList.get(position);

        imageView.setImageResource(eSong.getAlbum());
        textView1.setText(eSong.getNameSong());
        textView2.setText(eSong.getSinger());
        textView3.setText(eSong.getTime());
        imageView1.setImageResource(R.mipmap.arrow_right);

        return convertView;
    }
}
