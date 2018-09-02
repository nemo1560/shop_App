package com.example.nemo1.cardview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eDemo2;

import java.util.List;

public class adpDemo2 extends RecyclerView.Adapter<adpDemo2.Demo2ViewHolder> {

    private List<eDemo2> eDemo2List;
    private Context context;
    private LayoutInflater layoutInflater;

    public adpDemo2(List<eDemo2> eDemo2List, Context context) {
        this.eDemo2List = eDemo2List;
        this.context = context;
        this.layoutInflater = layoutInflater.from(context);
    }

    @NonNull
    @Override
    public Demo2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.demo2,parent,false);
        return new Demo2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Demo2ViewHolder holder, int position) {
        eDemo2 eDemo2 = eDemo2List.get(position);
        holder.imageView.setImageResource(eDemo2.getImg());
        holder.textView1.setText(eDemo2.getText1());
        holder.textView2.setText(eDemo2.getText2());
    }

    @Override
    public int getItemCount() {
        return eDemo2List.size();
    }

    public class Demo2ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView1,textView2;

        public Demo2ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgDemo2);
            textView1 = itemView.findViewById(R.id.text1Demo2);
            textView2 = itemView.findViewById(R.id.text2Demo2);
        }
    }
}
