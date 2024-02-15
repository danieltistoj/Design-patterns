package org.example.Class;

import org.example.Interface.Payment;

public class PayPalPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("paypal payment");
    }
}
