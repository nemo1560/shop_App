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
import com.example.nemo1.view_customview.entity.eMyseft;

import java.util.List;

public class myseftAdapter extends ArrayAdapter<eMyseft>{

    private Context context;
    private int resource;
    private List<eMyseft> eMyseftList;

    public myseftAdapter(@NonNull Context context, int resource, @NonNull List<eMyseft> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eMyseftList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(this.resource,parent,false);

        ImageView imageView = view.findViewById(R.id.img_myseft);
        TextView textView = view.findViewById(R.id.text_mmyseft);

        eMyseft eMyseft = eMyseftList.get(position);

        imageView.setImageResource(eMyseft.getImg());
        textView.setText(eMyseft.getContent());

        return view;
    }
}
