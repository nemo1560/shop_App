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
import com.example.nemo1.view_customview.entity.eFruit;

import java.util.List;

public class grid_fruitAdapter extends ArrayAdapter<eFruit>{

    private Context context;
    private List<eFruit> eFruitList;
    private int resource;

    public grid_fruitAdapter(@NonNull Context context, int resource, @NonNull List<eFruit> objects) {
        super(context, resource, objects);
        this.context = context;
        this.eFruitList = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(this.resource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.img_fruit);
        TextView textView = convertView.findViewById(R.id.text_fruit);

        eFruit eFruit = eFruitList.get(position);

        imageView.setImageResource(eFruit.getImage());
        textView.setText(eFruit.getName());

        return convertView;
    }
}
