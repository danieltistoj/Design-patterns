package org.example;

import org.example.Factory.CombustionVehicleFactory;
import org.example.Factory.ElectricVehicleFactory;
import org.example.Interface.Car;
import org.example.Interface.Motorcycle;
import org.example.Interface.VehicleProductFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VehicleProductFactory factory = null;
        Car car ;
        Motorcycle motorcycle;

        boolean exit = false;
        while (!exit){
            System.out.println("What type of vehicles do you want to manufacture?");
            System.out.println("1. Electric Vehicles");
            System.out.println("2. Combustion Vehicles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    factory = new ElectricVehicleFactory();
                    break;
                case 2:
                    factory = new CombustionVehicleFactory();
                 break;
                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Selecting electric vehicles by default.");
                    factory = new ElectricVehicleFactory();
                    break;

            }
            if (!exit) {
                car = factory.createCar();
                motorcycle = factory.createMotorcycle();

                car.drive();
                motorcycle.drive();
            }
        }
    }
}