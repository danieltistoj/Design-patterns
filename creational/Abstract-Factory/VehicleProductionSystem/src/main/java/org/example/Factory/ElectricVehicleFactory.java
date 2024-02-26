package org.example.Factory;

import org.example.Class.Electric.ElectricCar;
import org.example.Class.Electric.ElectricMotorcycle;
import org.example.Interface.Car;
import org.example.Interface.Motorcycle;
import org.example.Interface.VehicleProductFactory;

public class ElectricVehicleFactory implements VehicleProductFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new ElectricMotorcycle();
    }
}
