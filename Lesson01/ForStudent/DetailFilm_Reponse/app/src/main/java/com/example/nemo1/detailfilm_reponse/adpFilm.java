package com.example.nemo1.detailfilm_reponse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class adpFilm extends RecyclerView.Adapter<adpFilm.ViewHolder> {

    private List<eFilm> eFilmList;
    private Context context;
    private LayoutInflater layoutInflater;
    private ListFilmOnClick listFilmOnClick;

    public adpFilm(List<eFilm> eFilmList, Context context) {
        this.eFilmList = eFilmList;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_film_cardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final eFilm eFilm = eFilmList.get(position);
        holder.imgFilm.setImageResource(eFilm.getmImgFilm());
        holder.nameFilm.setText(eFilm.getMfilmName());
        holder.sumaryFilm.setText(eFilm.getmSummary());
        holder.imgFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int orenation = context.getResources().getConfiguration().orientation;
                switch (orenation){
                    case 1:
                        Intent intent = new Intent(context,imgZoomActivity.class);
                        intent.putExtra("eFilm",eFilm);
                        Toast.makeText(context.getApplicationContext(),eFilm.getMfilmName(),Toast.LENGTH_SHORT).show();
                        context.getApplicationContext().startActivity(intent);
                        break;
                    case 2:
                        listFilmOnClick = (ListFilmOnClick) context;
                        listFilmOnClick.OnClicked(eFilm);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return eFilmList.size();
    }
    /*
    * set interface for get data for 2 fragment in 1 layout
    * */
    public interface ListFilmOnClick{
        void OnClicked(eFilm eFilm);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFilm;
        private TextView nameFilm,sumaryFilm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFilm = itemView.findViewById(R.id.imgFilm);
            nameFilm = itemView.findViewById(R.id.nameFilm);
            sumaryFilm = itemView.findViewById(R.id.sumaryFilm);
        }
    }
}