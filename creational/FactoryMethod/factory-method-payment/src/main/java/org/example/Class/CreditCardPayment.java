package org.example.Class;

import org.example.Interface.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("credit card payment");
    }
}
