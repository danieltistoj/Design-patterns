package org.example.Class.Phone;

import org.example.Interface.MobilPhone;

public class HighEndMobilePhone implements MobilPhone {
    @Override
    public void displayInfo() {
        System.out.println("Este es un teléfono móvil de gama alta.");
    }
}
