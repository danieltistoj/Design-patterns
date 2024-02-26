package org.example;

import org.example.Factory.HighEndDeviceFactory;
import org.example.Interface.ElectronicDeviceFactory;
import org.example.Interface.Laptop;
import org.example.Interface.MobilPhone;

public class Main {
    public static void main(String[] args) {
        ElectronicDeviceFactory factory = new HighEndDeviceFactory();
        MobilPhone mobilPhone = factory.createMobilPhone();
        Laptop laptop = factory.createLaptop();

        mobilPhone.displayInfo();
        laptop.displayInfo();
    }
}