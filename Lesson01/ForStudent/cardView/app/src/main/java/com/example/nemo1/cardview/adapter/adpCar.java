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
import com.example.nemo1.cardview.entity.eCar;

import java.util.List;

public class adpCar extends RecyclerView.Adapter<adpCar.CarviewHolder> {

    private List<eCar> eCarList;
    private Context context;
    private LayoutInflater layoutInflater;

    public adpCar(List<eCar> eCarList, Context context) {
        this.eCarList = eCarList;
        this.context = context;
        this.layoutInflater = layoutInflater.from(context);
    }

    @NonNull
    @Override
    public CarviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.row_car,parent,false);
        return new CarviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarviewHolder holder, int position) {
        eCar eCar = eCarList.get(position);
        holder.imageView.setImageResource(eCar.getImgCar());
        holder.textView1.setText(eCar.getNameCar());
        holder.textView2.setText(eCar.getCount());
    }

    @Override
    public int getItemCount() {
        return eCarList.size();
    }

    public class CarviewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1,textView2;

        public CarviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgCar);
            textView1 = itemView.findViewById(R.id.text1Car);
            textView2 = itemView.findViewById(R.id.text2Car);
        }
    }
}
