package org.example.Class;

import org.example.Interface.Payment;

public class BitcoinPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("Bitcoin payment");
    }
}
