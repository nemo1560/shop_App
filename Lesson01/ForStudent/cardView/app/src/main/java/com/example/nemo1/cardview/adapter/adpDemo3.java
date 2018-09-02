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
import com.example.nemo1.cardview.entity.eDemo3;

import java.util.List;

public class adpDemo3 extends RecyclerView.Adapter<adpDemo3.Demo3ViewHolder>{

    private List<eDemo3>eDemo3List;
    private Context context;
    private LayoutInflater layoutInflater;

    public adpDemo3(List<eDemo3> eDemo3List, Context context) {
        this.eDemo3List = eDemo3List;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Demo3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.demo3,parent,false);
        return new Demo3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Demo3ViewHolder holder, int position) {
        eDemo3 eDemo3 = eDemo3List.get(position);
        holder.imageView.setImageResource(eDemo3.getImg());
        holder.textView1.setText(eDemo3.getText1());
        holder.textView2.setText(eDemo3.getText2());
    }

    @Override
    public int getItemCount() {
        return eDemo3List.size();
    }

    public class Demo3ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1,textView2;

        public Demo3ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgDemo3);
            textView1 = itemView.findViewById(R.id.text1Demo3);
            textView2 = itemView.findViewById(R.id.text2Demo3);
        }
    }
}
