package org.example.Class;

import org.example.Interface.Payment;

public class ApplePayPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("Apple pay payment");
    }
}
