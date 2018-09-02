package com.example.nemo1.detailfilm_reponse;

import java.io.Serializable;

public class eFilm implements Serializable {
    private int mImgFilm;
    private String mfilmName;
    private String mSummary;
    private String mRating;
    private String mYear;
    private String mGenre;

    public eFilm(int mImgFilm, String mfilmName, String mSummary, String mRating, String mYear, String mGenre) {
        this.mImgFilm = mImgFilm;
        this.mfilmName = mfilmName;
        this.mSummary = mSummary;
        this.mRating = mRating;
        this.mYear = mYear;
        this.mGenre = mGenre;
    }

    public eFilm() {
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

    public String getmSummary() {
        return mSummary;
    }

    public void setmSummary(String mSummary) {
        this.mSummary = mSummary;
    }
}
