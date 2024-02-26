package org.example.Class.Combustion;

import org.example.Interface.Car;
import org.example.Interface.Motorcycle;

public class CombustionMotorcycle implements Motorcycle {
    @Override
    public void drive() {
        System.out.println("this is a combustion motorcycle");
    }
}
