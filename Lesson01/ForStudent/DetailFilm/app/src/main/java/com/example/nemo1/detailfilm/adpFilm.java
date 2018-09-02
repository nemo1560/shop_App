package com.example.nemo1.detailfilm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
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
                Bundle bundle = new Bundle();
                bundle.putInt("img",eFilm.getmImgFilm());
                bundle.putString("summary",eFilm.getmSummary());
                Fragment fragment = new imgZoom(); /*Set fragment object fro class Extend Fragment*/
                fragment.setArguments(bundle); /*Set bundle in fragment*/
                replaceFrament(fragment);
            }

            /*
             Set replace Fragment in layout.
            * */
            private void replaceFrament(Fragment fragment) {
                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.listFilm_frament,fragment);
                fragmentTransaction.commit();
            }
        });
    }
    public interface onClicked{
        void OnClicked();
    }

    @Override
    public int getItemCount() {

        return eFilmList.size();
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