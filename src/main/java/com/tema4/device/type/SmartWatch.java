package com.tema4.device.type;

import com.tema4.device.SmartDevice;

public class SmartWatch extends SmartDevice {

    private int numStraps;
    private String ramMemory;
    private boolean callOption;

    public SmartWatch(String nameDevice, int yearModel, int numStraps, String ramMemory, boolean callOption) {
        super(nameDevice, yearModel);
        this.numStraps = numStraps;
        this.ramMemory = ramMemory;
        this.callOption = callOption;
    }

    public int getNumStraps() {
        return numStraps;
    }
    public void setNumStraps(int numStraps) {
        this.numStraps = numStraps;
    }

    public String getRamMemory() {
        return ramMemory;
    }
    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public boolean isCallOption() {
        return callOption;
    }
    public void setCallOption(boolean callOption) {
        this.callOption = callOption;
    }
}
