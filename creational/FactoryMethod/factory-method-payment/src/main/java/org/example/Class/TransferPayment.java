package org.example.Class;

import org.example.Interface.Payment;

public class TransferPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("transfer payment");
    }
}
