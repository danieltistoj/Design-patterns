package org.example.products;

import org.example.Notification;

import java.sql.SQLOutput;

public class Sms implements Notification {
    @Override
    public void send(String message) {
        System.out.println("This is an email message: "+ message );
    }


}
