package com.example.nemo1.gui.Contrroller;

import com.example.nemo1.gui.Entity.eGetInfoStudent;
import com.example.nemo1.gui.Model.mGetInfoStudent;

public class cGetInfoStudent extends cBaseController<eGetInfoStudent>{

    @Override
    public boolean checkAccount_controller(eGetInfoStudent objT) {
        return false;
    }

    @Override
    public double calculator_controller(eGetInfoStudent obj) {
        return 0;
    }

    @Override
    public boolean checkRegistraton_controller(eGetInfoStudent objT) {
        return false;
    }

    public String getInfoStudent_controller(eGetInfoStudent obj) {
        mGetInfoStudent mGetInfoStudent = new mGetInfoStudent();
        return mGetInfoStudent.getInfoStudent_model(obj);
    }
}
