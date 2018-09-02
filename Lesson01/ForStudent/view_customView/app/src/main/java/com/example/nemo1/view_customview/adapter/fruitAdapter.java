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
import com.example.nemo1.view_customview.act_Fruit_ListView;
import com.example.nemo1.view_customview.act_ListView_custom;
import com.example.nemo1.view_customview.entity.eFruit;
import java.util.List;

public class fruitAdapter extends ArrayAdapter<eFruit> {

    private Context context;
    private int resource;
    private List<eFruit> fruits;

    public fruitAdapter(@NonNull Context context, int resource, @NonNull List<eFruit> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.fruits = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(this.resource, parent,false);

        ImageView image_fruit = view.findViewById(R.id.image_fruit);
        TextView header_fruit = view.findViewById(R.id.header_fruit);
        TextView content_fruit = view.findViewById(R.id.content_fruit);

        eFruit eFruit = fruits.get(position);

        image_fruit.setImageResource(eFruit.getImage());
        header_fruit.setText(eFruit.getName());
        content_fruit.setText(eFruit.getContent());

        return view;
    }
}
