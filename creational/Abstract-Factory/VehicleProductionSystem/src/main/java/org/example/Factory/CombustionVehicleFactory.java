package org.example.Factory;

import org.example.Class.Combustion.CombustionCar;
import org.example.Class.Combustion.CombustionMotorcycle;
import org.example.Interface.Car;
import org.example.Interface.Motorcycle;
import org.example.Interface.VehicleProductFactory;

public class CombustionVehicleFactory implements VehicleProductFactory {
    @Override
    public Car createCar() {
        return new CombustionCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new CombustionMotorcycle();
    }
}
