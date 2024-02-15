package org.example.Factory;

import org.example.Class.*;
import org.example.Enum.PaymentType;
import org.example.Interface.Payment;

public class FactoryPayment {
    public Payment getPayment(PaymentType paymentType){
        return switch (paymentType){
            case CASH -> new CashPayment();
            case PAYPAL -> new PayPalPayment();
            case TRANSFER -> new TransferPayment();
            case APPLE_PAY -> new ApplePayPayment();
            case BITCOIN -> new BitcoinPayment();
            case CREDIT_CARD -> new CreditCardPayment();
            case DEBIT -> new DebitPayment();
            case GOOGLE_PAY -> new GooglePayPayment();
        };
    }
}
