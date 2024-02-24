package org.example.Class.Factories;

import org.example.Class.Payment.CashPaymentProcessor;
import org.example.Class.Product.PhysicalProduct;
import org.example.Interface.OrderProcessingFactory;
import org.example.Interface.PaymentProcessor;
import org.example.Interface.Product;

public class PhysicalStoreFactory implements OrderProcessingFactory {
    @Override
    public Product createProduct() {
        return new PhysicalProduct();
    }

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CashPaymentProcessor();
    }
}
