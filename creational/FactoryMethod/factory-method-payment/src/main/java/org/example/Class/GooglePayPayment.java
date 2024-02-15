package org.example.Class;

import org.example.Interface.Payment;

public class GooglePayPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("google pay payment");
    }
}
