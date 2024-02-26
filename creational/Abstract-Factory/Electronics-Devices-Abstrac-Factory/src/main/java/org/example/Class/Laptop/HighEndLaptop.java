package org.example.Class.Laptop;

import org.example.Interface.Laptop;

public class HighEndLaptop implements Laptop {
    @Override
    public void displayInfo() {
        System.out.printf("Este es un ordenador portátil de gama alta.");
    }
}
