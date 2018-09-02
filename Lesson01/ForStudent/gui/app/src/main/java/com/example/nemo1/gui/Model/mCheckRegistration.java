package com.example.nemo1.gui.Model;

import com.example.nemo1.gui.Entity.eRegistration;

public class mCheckRegistration extends mBaseModel<eRegistration> {
    @Override
    public boolean checkAccount_model(eRegistration obj) {
        //don't use
        return false;
    }

    @Override
    public double calculator_model(eRegistration obj) {
        //don't use
        return 0;
    }

    @Override
    public boolean checkRegistraton_model(eRegistration obj) {
        switch (obj.getSex_Res()){
            case "Female":
                if(obj.getAge_Res() >= 19){
                    if(obj.getStatus_Res().equals("Divorced")||obj.getStatus_Res().equals("Single")){
                        return true;
                    }
                }
            case "Male":
                if(obj.getAge_Res() >= 22){
                    if(obj.getStatus_Res().equals("Divorced")||obj.getStatus_Res().equals("Single")){
                        return true;
                    }
                }
                default:
                    return false;
        }
    }

    @Override
    public String getInfoStudent_model(eRegistration obj) {
        return null;
    }

}
