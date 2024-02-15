package org.example.Class;

import org.example.Interface.Payment;

public class DebitPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("debit payment");
    }
}
