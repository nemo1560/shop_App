package com.example.nemo1.text_input_layout.controller;

import com.example.nemo1.text_input_layout.entity.eLogin;
import com.example.nemo1.text_input_layout.model.mLogin;

public class cLogin extends base_controller<eLogin> {
    @Override
    public boolean cLogin(eLogin ob) {
        mLogin mLogin = new mLogin();
        return mLogin.mLogin(ob);
    }
}
