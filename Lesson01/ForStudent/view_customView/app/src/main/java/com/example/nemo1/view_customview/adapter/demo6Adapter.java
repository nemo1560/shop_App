package com.example.nemo1.view_customview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eDemo6;

import java.util.List;

public class demo6Adapter extends ArrayAdapter<eDemo6> {

    private Context context;
    private int resource;
    private List<eDemo6> eDemo6List;

    public demo6Adapter(@NonNull Context context, int resource, @NonNull List<eDemo6> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eDemo6List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(this.resource,parent,false);

        eDemo6 eDemo6 = eDemo6List.get(position);

        ImageView imageView = convertView.findViewById(R.id.album);
        TextView textView = convertView.findViewById(R.id.tennhac);
        TextView textView1 = convertView.findViewById(R.id.loinhac);

        imageView.setImageResource(eDemo6.getAlbum());
        textView.setText(eDemo6.getTenhac());
        textView1.setText(eDemo6.getLoinhac());

        return convertView;
    }
}
