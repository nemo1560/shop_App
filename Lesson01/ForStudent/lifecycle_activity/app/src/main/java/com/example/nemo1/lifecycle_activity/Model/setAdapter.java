package com.example.nemo1.lifecycle_activity.Model;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.nemo1.lifecycle_activity.R;
import com.example.nemo1.lifecycle_activity.entity.songs;

import java.util.List;

public class setAdapter extends ArrayAdapter {
    private Activity activity;
    private int resource;
    private List<songs> listSong;


    public setAdapter(Activity activity, int resource, List<songs> listSong) {
        super(activity, resource,listSong);
        this.activity = activity;
        this.resource = resource;
        this.listSong = listSong;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();

        View view = layoutInflater.inflate(this.resource,parent,false);

        ImageView imageView = view.findViewById(R.id.image_custom);
        TextView editText = view.findViewById(R.id.text_custom);

        songs songs = this.listSong.get(position);

        imageView.setImageResource(songs.getSongImage());
        editText.setText(songs.getSongName());

        return view;
    }
}

