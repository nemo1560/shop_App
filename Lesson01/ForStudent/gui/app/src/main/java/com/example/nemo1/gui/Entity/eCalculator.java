package com.example.nemo1.gui.Entity;

public class eCalculator {
    private Double soA;
    private Double soB;
    private String option;

    public Double getSoA() {
        return soA;
    }

    public void setSoA(Double soA) {
        this.soA = soA;
    }

    public Double getSoB() {
        return soB;
    }

    public void setSoB(Double soB) {
        this.soB = soB;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public eCalculator(Double soA, Double soB, String option) {
        this.soA = soA;
        this.soB = soB;
        this.option = option;
    }

    public eCalculator() {
    }
}
