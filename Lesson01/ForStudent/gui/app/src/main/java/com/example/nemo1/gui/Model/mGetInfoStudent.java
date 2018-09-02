package com.example.nemo1.gui.Model;

import com.example.nemo1.gui.Entity.eGetInfoStudent;

public class mGetInfoStudent extends mBaseModel<eGetInfoStudent> {

    @Override
    public boolean checkAccount_model(eGetInfoStudent obj) {
        return false;
    }

    @Override
    public double calculator_model(eGetInfoStudent obj) {
        return 0;
    }

    @Override
    public boolean checkRegistraton_model(eGetInfoStudent obj) {
        return false;
    }

    @Override
    public String getInfoStudent_model(eGetInfoStudent obj) {
       String show = obj.getMaSV()+" "+obj.getTenSV()+" "+obj.getGioitinhSV()+" "+obj.getNgaysinhSV()+" "+obj.getDtSV()+" "+obj.getEmailSV()+" "+obj.getSoCMNDSV();
        return show;
    }
}
