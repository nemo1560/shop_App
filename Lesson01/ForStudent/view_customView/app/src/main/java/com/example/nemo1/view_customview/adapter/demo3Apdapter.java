package com.example.nemo1.view_customview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eDemo3;
import java.util.List;

public class demo3Apdapter extends ArrayAdapter<eDemo3> {
    private Context context;
    private int resource;
    private List<eDemo3> eDemo3List;

    public demo3Apdapter(@NonNull Context context, int resource, @NonNull List<eDemo3> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.eDemo3List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(this.resource,parent,false);

        TextView textView_header = convertView.findViewById(R.id.header_demo3);
        TextView textView_content = convertView.findViewById(R.id.content_demo3);
        ImageView img1 = convertView.findViewById(R.id.img_icon_1);
        ImageView img2 = convertView.findViewById(R.id.img_icon_2);

        eDemo3 eDemo3 = eDemo3List.get(position);

        textView_header.setText(eDemo3.getHeader());
        textView_content.setText(eDemo3.getContent());
        img1.setImageResource(eDemo3.getImg1());
        img2.setImageResource(eDemo3.getImg2());

        return convertView;
    }
}
