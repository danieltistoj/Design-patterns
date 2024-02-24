package org.example.Class.Payment;

import org.example.Interface.PaymentProcessor;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Payment has been processed via credit card in the online store.");
    }
}
