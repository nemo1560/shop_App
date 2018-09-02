package com.example.nemo1.fragment;

import java.io.Serializable;

public class Film implements Serializable {
    private int mImgFilm;
    private String mfilmName;
    private String mRating;
    private String mYear;
    private String mGenre;

    public Film(int mImgFilm, String mfilmName, String mRating,
                String mYear, String mGenre) {
        this.mImgFilm = mImgFilm;
        this.mfilmName = mfilmName;
        this.mRating = mRating;
        this.mYear = mYear;
        this.mGenre = mGenre;
    }

    public int getmImgFilm() {
        return mImgFilm;
    }

    public void setmImgFilm(int mImgFilm) {
        this.mImgFilm = mImgFilm;
    }

    public String getMfilmName() {
        return mfilmName;
    }

    public void setMfilmName(String mfilmName) {
        this.mfilmName = mfilmName;
    }

    public String getmRating() {
        return mRating;
    }

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }
}
