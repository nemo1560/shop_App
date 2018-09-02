package com.example.nemo1.gui.Model;

import com.example.nemo1.gui.Entity.eAccount;

public class mCheckAccount extends mBaseModel<eAccount> {

    @Override
    public boolean checkAccount_model(eAccount obj) {
        if(obj.getUser().equals("admin")&&obj.getPass().equals("admin")){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public double calculator_model(eAccount obj) {
        return 0;
    }

    @Override
    public boolean checkRegistraton_model(eAccount obj) {
        return false;
    }

    @Override
    public String getInfoStudent_model(eAccount obj) {
        return null;
    }

}
