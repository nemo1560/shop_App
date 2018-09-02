package com.example.nemo1.gui.Contrroller;

import com.example.nemo1.gui.Entity.eRegistration;
import com.example.nemo1.gui.Model.mCheckRegistration;

public class cCheckRegistraton extends cBaseController<eRegistration>{
    @Override
    public boolean checkAccount_controller(eRegistration objT) {
        //don't use;
        return false;
    }

    @Override
    public double calculator_controller(eRegistration obj) {
        //don't use;
        return 0;
    }

    @Override
    public boolean checkRegistraton_controller(eRegistration objT) {
        mCheckRegistration mCheckRegistration = new mCheckRegistration();
        return mCheckRegistration.checkRegistraton_model(objT);
    }

    @Override
    public String getInfoStudent_controller(eRegistration obj) {
        return null;
    }

}
