package com.example.nemo1.cardview.model;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eCar;

import java.util.ArrayList;
import java.util.List;

public class mCar {
    private List<eCar> eCarList;
    private eCar eCar;

    public List<eCar> geteCarList() {
        eCarList = new ArrayList<>();
        eCar eCar1 = new eCar(R.mipmap.toyota,"TOYOTA","1.000 tin rao");
        eCar eCar2 = new eCar(R.mipmap.ford,"FORD","1.000 tin rao");
        eCar eCar3 = new eCar(R.mipmap.lam,"LAMBOGHINI","1.000 tin rao");
        eCar eCar4 = new eCar(R.mipmap.fer,"FERRARI","1.000 tin rao");
        eCar eCar5 = new eCar(R.mipmap.kia,"KIA","1.000 tin rao");
        eCar eCar6 = new eCar(R.mipmap.mec,"MECCEDES","1.000 tin rao");

        eCarList.add(eCar1);
        eCarList.add(eCar2);
        eCarList.add(eCar3);
        eCarList.add(eCar4);
        eCarList.add(eCar5);
        eCarList.add(eCar6);

        return eCarList;
    }
}
