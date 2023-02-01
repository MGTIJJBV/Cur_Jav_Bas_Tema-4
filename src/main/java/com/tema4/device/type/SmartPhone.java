package com.tema4.device.type;

import com.tema4.device.SmartDevice;

public class SmartPhone extends SmartDevice {

    private int capacity;
    private String providerThelephone;
    private Double size;

    public SmartPhone(String nameDevice, int yearModel, int capacity, String providerThelephone, Double size) {
        super(nameDevice, yearModel);
        this.capacity = capacity;
        this.providerThelephone = providerThelephone;
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getProviderThelephone() {
        return providerThelephone;
    }
    public void setProviderThelephone(String providerThelephone) {
        this.providerThelephone = providerThelephone;
    }

    public Double getSize() {
        return size;
    }
    public void setSize(Double size) {
        this.size = size;
    }
}
