package org.example.Class.Laptop;

import org.example.Interface.Laptop;

public class MidRangeLaptop implements Laptop {
    @Override
    public void displayInfo() {
        System.out.printf("Este es un ordenador portátil de gama media.");
    }
}
