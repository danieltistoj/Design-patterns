package org.example;

import org.example.Enum.PaymentType;
import org.example.Factory.FactoryPayment;
import org.example.Interface.Payment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentType selectedPaymentType = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("Payment Types Menu:");
            System.out.println("1. PayPal");
            System.out.println("2. Credit Card");
            System.out.println("3. Debit Card");
            System.out.println("4. Bank Transfer");
            System.out.println("5. Bitcoin");
            System.out.println("6. Cash");
            System.out.println("7. Apple Pay");
            System.out.println("8. Google Pay");
            System.out.println("9. Exit");
            System.out.print("Select a payment type (1-9): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedPaymentType = PaymentType.PAYPAL;
                    break;
                case 2:
                    selectedPaymentType = PaymentType.CREDIT_CARD;
                    break;
                case 3:
                    selectedPaymentType = PaymentType.DEBIT;
                    break;
                case 4:
                    selectedPaymentType = PaymentType.TRANSFER;
                    break;
                case 5:
                    selectedPaymentType = PaymentType.BITCOIN;
                    break;
                case 6:
                    selectedPaymentType = PaymentType.CASH;
                    break;
                case 7:
                    selectedPaymentType = PaymentType.APPLE_PAY;
                    break;
                case 8:
                    selectedPaymentType = PaymentType.GOOGLE_PAY;
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please select a number from 1 to 9.");
                    continue; // Continue to the beginning of the loop
            }

            if (!exit) {
                FactoryPayment factoryPayment = new FactoryPayment();
                Payment payment = factoryPayment.getPayment(selectedPaymentType);
                System.out.println("\n---Result---");
                payment.createPayment();
                System.out.println("\n");
            }
        }
        System.out.println("Exiting the program...");
    }
}