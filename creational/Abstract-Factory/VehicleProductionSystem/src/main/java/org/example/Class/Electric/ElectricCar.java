package org.example.Class.Electric;

import org.example.Interface.Car;

public class ElectricCar implements Car {
    @Override
    public void drive() {
        System.out.println("this is a electric  car");
    }
}
