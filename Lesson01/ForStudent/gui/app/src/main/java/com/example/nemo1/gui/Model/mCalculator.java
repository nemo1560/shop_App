package com.example.nemo1.gui.Model;

import com.example.nemo1.gui.Entity.eCalculator;

public class mCalculator extends mBaseModel<eCalculator> {

    @Override
    public boolean checkAccount_model(eCalculator obj) {
        return false;
    }

    @Override
    public double calculator_model(eCalculator obj) {

        switch (obj.getOption()){
            case "Cộng":
                return obj.getSoA()+obj.getSoB();
            case "Trừ":
                return obj.getSoA()-obj.getSoB();
            case "Nhân":
                return obj.getSoA()*obj.getSoB();
            case "Chia":
                return obj.getSoA()/obj.getSoB();
        }
        return 0;
    }

    @Override
    public boolean checkRegistraton_model(eCalculator obj) {
        return false;
    }

    @Override
    public String getInfoStudent_model(eCalculator obj) {
        return null;
    }

}
