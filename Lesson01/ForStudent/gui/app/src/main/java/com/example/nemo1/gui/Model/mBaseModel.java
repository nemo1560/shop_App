package com.example.nemo1.gui.Model;

public abstract class mBaseModel<T> {
    public abstract boolean checkAccount_model(T obj);
    public  abstract double calculator_model(T obj);
    public abstract  boolean checkRegistraton_model(T obj);
    public abstract String getInfoStudent_model(T obj);
}
