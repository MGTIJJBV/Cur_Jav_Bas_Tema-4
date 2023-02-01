package com.tema4;

import com.tema4.device.type.SmartPhone;
import com.tema4.device.type.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartWatch smartWatch = new SmartWatch("Apple smartwatch", 2022, 2, "2 gb", false);
        SmartPhone smartPhone = new SmartPhone("Iphone 14", 2023, 256, "Telcel", 7.9);

        System.out.println("SMART WATCH");
        System.out.println("Nombre : " + smartWatch.getNameDevice());
        System.out.println("Modelo : " + smartWatch.getYearModel());
        System.out.println("Numero de correas : " + smartWatch.getNumStraps());
        System.out.println("Memoria RAM : " + smartWatch.getRamMemory());
        System.out.println("Uso de llamadas : " + smartWatch.isCallOption());

        System.out.println("SMART WATCH");
        System.out.println("Nombre : " + smartPhone.getNameDevice());
        System.out.println("Modelo : " + smartPhone.getYearModel());
        System.out.println("Capacidad : " + smartPhone.getCapacity());
        System.out.println("Proveedor de telefonia : " + smartPhone.getProviderThelephone());
        System.out.println("Tamano de pantalla : " + smartPhone.getSize());
    }
}