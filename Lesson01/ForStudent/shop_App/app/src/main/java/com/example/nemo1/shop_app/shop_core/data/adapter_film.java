package com.example.nemo1.shop_app.shop_core.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.entity.eFilm;

import java.util.List;

public class adapter_film extends ArrayAdapter<eFilm> {

    private List<eFilm> eFilmList;
    private Context context;
    private int resource;

    public adapter_film(@NonNull Context context, int resource, @NonNull List<eFilm> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eFilmList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(resource,parent,false);
        ImageView imageView = convertView.findViewById(R.id.img_film);
        TextView textView1 = convertView.findViewById(R.id.name_film);
        TextView textView2 = convertView.findViewById(R.id.kind_film);

        eFilm eFilm = eFilmList.get(position);

        imageView.setImageResource(eFilm.getImg_film());
        textView1.setText(eFilm.getName_film());
        textView2.setText(eFilm.getKind_film());

        return convertView;
    }
}
