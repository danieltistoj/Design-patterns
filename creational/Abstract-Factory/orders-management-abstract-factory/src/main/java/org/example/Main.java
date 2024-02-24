package org.example;

import org.example.Class.Factories.PhysicalStoreFactory;
import org.example.Interface.OrderProcessingFactory;
import org.example.Interface.PaymentProcessor;
import org.example.Interface.Product;

public class Main {
    public static void main(String[] args) {
        OrderProcessingFactory factory = new PhysicalStoreFactory();
        Product product = factory.createProduct();
        PaymentProcessor paymentProcessor = factory.createPaymentProcessor();

        product.ship();
        paymentProcessor.processPayment();
    }
}