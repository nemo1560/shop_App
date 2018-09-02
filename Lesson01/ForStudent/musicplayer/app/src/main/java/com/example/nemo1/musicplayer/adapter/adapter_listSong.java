package com.example.nemo1.musicplayer.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nemo1.musicplayer.R;
import com.example.nemo1.musicplayer.entity.eSong;

import java.util.List;

public class adapter_listSong extends ArrayAdapter<eSong> {

    private Context context;
    private int resource;
    private List<eSong> eSongList;

    public adapter_listSong(@NonNull Context context, int resource, @NonNull List<eSong> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eSongList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(this.resource,parent,false);

        eSong eSong = eSongList.get(position);

        TextView tenbaihat = convertView.findViewById(R.id.tenbaihat);
        TextView casi = convertView.findViewById(R.id.casi);

        tenbaihat.setText(eSong.getSong());
        casi.setText(eSong.getSource());

        return convertView;
    }
}
