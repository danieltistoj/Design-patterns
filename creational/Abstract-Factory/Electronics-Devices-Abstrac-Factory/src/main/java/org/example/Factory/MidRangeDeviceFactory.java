package org.example.Factory;

import org.example.Class.Laptop.MidRangeLaptop;
import org.example.Class.Phone.MidRangeMobilePhone;
import org.example.Interface.ElectronicDeviceFactory;
import org.example.Interface.Laptop;
import org.example.Interface.MobilPhone;

public class MidRangeDeviceFactory implements ElectronicDeviceFactory {
    @Override
    public MobilPhone createMobilPhone() {
        return new MidRangeMobilePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MidRangeLaptop();
    }
}
