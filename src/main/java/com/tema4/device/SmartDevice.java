package com.tema4.device;

public class SmartDevice {

    private String nameDevice;
    private int yearModel;

    public SmartDevice(String nameDevice, int yearModel) {
        this.nameDevice = nameDevice;
        this.yearModel = yearModel;
    }

    public String getNameDevice() {
        return nameDevice;
    }
    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public int getYearModel() {
        return yearModel;
    }
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
}
