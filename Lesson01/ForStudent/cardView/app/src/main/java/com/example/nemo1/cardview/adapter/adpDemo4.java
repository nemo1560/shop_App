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
import com.example.nemo1.cardview.entity.eDemo4;


import java.util.List;

public class adpDemo4 extends RecyclerView.Adapter<adpDemo4.Demo4ViewHolder> {

    private List<eDemo4> eDemo4List;
    private Context context;
    private LayoutInflater layoutInflater;

    public adpDemo4( Context context, List<eDemo4> eDemo4List) {
        this.eDemo4List = eDemo4List;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Demo4ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.row_cardview,parent,false);
        return new Demo4ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Demo4ViewHolder holder, int position) {
        eDemo4 eDemo4 = eDemo4List.get(position);
        holder.imageView.setImageResource(eDemo4.getImg());
        holder.textView1.setText(eDemo4.getText1());
        holder.textView2.setText(eDemo4.getText2());
    }

    @Override
    public int getItemCount() {
        return eDemo4List.size();
    }

    public class Demo4ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1, textView2;

        public Demo4ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgRow);
            textView1 = itemView.findViewById(R.id.textRow1);
            textView2 = itemView.findViewById(R.id.textRow2);
        }
    }
}
