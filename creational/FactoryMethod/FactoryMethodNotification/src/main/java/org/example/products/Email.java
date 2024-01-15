package org.example.products;

import org.example.Notification;

public class Email implements Notification {

    @Override
    public void send(String message) {
        System.out.println("this is a sms message: "+message);
    }
}
