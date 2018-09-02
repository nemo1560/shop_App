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
import com.example.nemo1.shop_app.shop_core.entity.eBook;

import java.util.List;

public class adapter_book extends ArrayAdapter<eBook> {

    private List<eBook> eBookList;
    private int resource;
    private Context context;

    public adapter_book(@NonNull Context context, int resource, @NonNull List<eBook> objects) {
        super(context, resource, objects);
        this.eBookList = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(resource, parent,false);
        ImageView imageView = convertView.findViewById(R.id.img_book);
        TextView textView1 = convertView.findViewById(R.id.name_book);
        TextView textView2 = convertView.findViewById(R.id.summary_book);

        eBook eBook = eBookList.get(position);

        imageView.setImageResource(eBook.getImg_book());
        textView1.setText(eBook.getName_book());
        textView2.setText(eBook.getSummary_book());

        return convertView;
    }
}
