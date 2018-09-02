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
import com.example.nemo1.view_customview.entity.eDemo4;

import java.util.List;

public class demo4Adapter extends ArrayAdapter<eDemo4> {
    private Context context;
    private int resource;
    private List<eDemo4> eDemo4List;

    public demo4Adapter(@NonNull Context context, int resource, @NonNull List<eDemo4> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eDemo4List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(this.resource,parent,false);
        eDemo4 eDemo4 = eDemo4List.get(position);

        ImageView imageView = convertView.findViewById(R.id.img_Demo4);
        TextView textView = convertView.findViewById(R.id.text_Demo4);

        imageView.setImageResource(eDemo4.getImg());
        textView.setText(eDemo4.getName());

        return convertView;
    }
}
