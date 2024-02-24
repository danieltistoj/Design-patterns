package org.example.Class.Factories;

import org.example.Class.Payment.CreditCardPaymentProcessor;
import org.example.Class.Product.OnlineProduct;
import org.example.Interface.OrderProcessingFactory;
import org.example.Interface.PaymentProcessor;
import org.example.Interface.Product;

public class OnlineStoreFactory implements OrderProcessingFactory {
    @Override
    public Product createProduct() {
        return new OnlineProduct();
    }

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardPaymentProcessor();
    }
}
