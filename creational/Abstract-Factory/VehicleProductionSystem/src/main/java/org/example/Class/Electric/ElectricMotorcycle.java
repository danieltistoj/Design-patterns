package org.example.Class.Electric;

import org.example.Interface.Motorcycle;

public class ElectricMotorcycle implements Motorcycle {
    @Override
    public void drive() {
        System.out.println("this is an electric motorcycle");
    }
}
