package org.example.Factory;

import org.example.Class.Laptop.HighEndLaptop;
import org.example.Class.Phone.HighEndMobilePhone;
import org.example.Interface.ElectronicDeviceFactory;
import org.example.Interface.Laptop;
import org.example.Interface.MobilPhone;

public class HighEndDeviceFactory implements ElectronicDeviceFactory {
    @Override
    public MobilPhone createMobilPhone() {
        return new HighEndMobilePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new HighEndLaptop();
    }
}
