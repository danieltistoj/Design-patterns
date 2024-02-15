package org.example.Class;

import org.example.Interface.Payment;

public class CashPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("cash payment");
    }
}
