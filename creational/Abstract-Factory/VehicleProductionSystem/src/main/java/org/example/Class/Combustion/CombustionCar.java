package org.example.Class.Combustion;

import org.example.Interface.Car;

public class CombustionCar implements Car {
    @Override
    public void drive() {
        System.out.println("this is a combustion car");
    }
}
