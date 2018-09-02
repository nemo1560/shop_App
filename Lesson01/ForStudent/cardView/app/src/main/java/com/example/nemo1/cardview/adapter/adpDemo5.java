package com.example.nemo1.cardview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eDemo5;

import java.util.List;

public class adpDemo5 extends RecyclerView.Adapter<adpDemo5.Demo5ViewHolder> {
    private Context context;
    private List<eDemo5> eDemo5List;
    private LayoutInflater layoutInflater;

    public adpDemo5(Context context, List<eDemo5> eDemo5List) {
        this.context = context;
        this.eDemo5List = eDemo5List;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Demo5ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.row_imgview,parent,false);
        return new Demo5ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Demo5ViewHolder holder, int position) {
        eDemo5 eDemo5 = eDemo5List.get(position);
        holder.imageView.setImageResource(eDemo5.getImg());
    }

    @Override
    public int getItemCount() {
        return eDemo5List.size();
    }

    public class Demo5ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public Demo5ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.hinhxua);
        }
    }
}
