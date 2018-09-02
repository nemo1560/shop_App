package com.example.nemo1.gui.Entity;

public class eGetInfoStudent {
    private String maSV;
    private String tenSV;
    private String gioitinhSV;
    private String ngaysinhSV;
    private int dtSV;
    private String emailSV;
    private int soCMNDSV;

    public eGetInfoStudent() {
    }

    public eGetInfoStudent(String maSV, String tenSV, String gioitinhSV, String ngaysinhSV, int dtSV, String emailSV, int soCMNDSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioitinhSV = gioitinhSV;
        this.ngaysinhSV = ngaysinhSV;
        this.dtSV = dtSV;
        this.emailSV = emailSV;
        this.soCMNDSV = soCMNDSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioitinhSV() {
        return gioitinhSV;
    }

    public void setGioitinhSV(String gioitinhSV) {
        this.gioitinhSV = gioitinhSV;
    }

    public String getNgaysinhSV() {
        return ngaysinhSV;
    }

    public void setNgaysinhSV(String ngaysinhSV) {
        this.ngaysinhSV = ngaysinhSV;
    }

    public int getDtSV() {
        return dtSV;
    }

    public void setDtSV(int dtSV) {
        this.dtSV = dtSV;
    }

    public String getEmailSV() {
        return emailSV;
    }

    public void setEmailSV(String emailSV) {
        this.emailSV = emailSV;
    }

    public int getSoCMNDSV() {
        return soCMNDSV;
    }

    public void setSoCMNDSV(int soCMNDSV) {
        this.soCMNDSV = soCMNDSV;
    }
}
