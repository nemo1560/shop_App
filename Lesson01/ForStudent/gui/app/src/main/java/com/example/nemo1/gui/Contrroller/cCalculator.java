package com.example.nemo1.gui.Contrroller;

import com.example.nemo1.gui.Entity.eCalculator;
import com.example.nemo1.gui.Model.mCalculator;

public class cCalculator extends cBaseController<eCalculator>{

    @Override
    public boolean checkAccount_controller(eCalculator objT) {
        //Khong su dung
        return false;
    }

    @Override
    public double calculator_controller(eCalculator obj) {
        mCalculator mCalculator = new mCalculator();
        return mCalculator.calculator_model(obj);
    }

    @Override
    public boolean checkRegistraton_controller(eCalculator objT) {
        //Khong su dung
        return false;
    }

    @Override
    public String getInfoStudent_controller(eCalculator obj) {
        return null;
    }
}
