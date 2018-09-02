package com.example.nemo1.gui.Contrroller;


public abstract class cBaseController<T>{
    public abstract boolean checkAccount_controller(T objT);
    public abstract double calculator_controller(T obj);
    public abstract boolean checkRegistraton_controller(T objT);
    public abstract String getInfoStudent_controller(T obj);
}
