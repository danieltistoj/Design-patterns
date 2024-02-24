package org.example.Class.Payment;

import org.example.Interface.PaymentProcessor;

public class CashPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Payment has been received in cash in the physical store.");
    }
}
