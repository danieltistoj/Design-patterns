package org.example.Interface;

public interface OrderProcessingFactory {
    Product createProduct();
    PaymentProcessor createPaymentProcessor();
}
