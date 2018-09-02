package com.example.nemo1.shop_app.shop_core.data;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.entity.eFilm;

import java.util.ArrayList;
import java.util.List;

public class mFilm {
    private List<eFilm>eFilmList;

    public List<eFilm> geteFilmList() {
        eFilmList = new ArrayList<>();

        eFilm eFilm1 = new eFilm(R.mipmap.crazy_kid,"Crazy Rich Asians","Drama");
        eFilm eFilm2 = new eFilm(R.mipmap.the_meg,"The Meg","Action");
        eFilm eFilm3 = new eFilm(R.mipmap.impossible,"Mission 6","Action");
        eFilm eFilm4 = new eFilm(R.mipmap.incredibles,"Incredibles 2","Action");
        eFilm eFilm5 = new eFilm(R.mipmap.avengers,"Avengers: Infinity War","Adventure");
        eFilm eFilm6 = new eFilm(R.mipmap.star_is_born,"A Star Is Born","Drama");
        eFilm eFilm7 = new eFilm(R.mipmap.predator,"The Predator","Action");
        eFilm eFilm8 = new eFilm(R.mipmap.nun,"The Nun","Horror");
        eFilm eFilm9 = new eFilm(R.mipmap.first_men,"First Man","Adventure");
        eFilm eFilm10 = new eFilm(R.mipmap.deadpool,"Deadpool 2","Action");
        eFilm eFilm11 = new eFilm(R.mipmap.it,"It","Horror");

        eFilmList.add(eFilm1);
        eFilmList.add(eFilm2);
        eFilmList.add(eFilm3);
        eFilmList.add(eFilm4);
        eFilmList.add(eFilm5);
        eFilmList.add(eFilm6);
        eFilmList.add(eFilm7);
        eFilmList.add(eFilm8);
        eFilmList.add(eFilm9);
        eFilmList.add(eFilm10);
        eFilmList.add(eFilm11);

        return eFilmList;
    }
}
