package com.example.nemo1.gui.Contrroller;


import com.example.nemo1.gui.Entity.eAccount;
import com.example.nemo1.gui.Model.mCheckAccount;

public class cCheckAccount extends cBaseController<eAccount>{

    @Override
    public boolean checkAccount_controller(eAccount objT) {
        mCheckAccount mCheckAccount = new mCheckAccount();
        return mCheckAccount.checkAccount_model(objT);
    }

    @Override
    public double calculator_controller(eAccount obj) {
        return 0;
    }

    @Override
    public boolean checkRegistraton_controller(eAccount objT) {
        return false;
    }

    @Override
    public String getInfoStudent_controller(eAccount obj) {
        return null;
    }
}
