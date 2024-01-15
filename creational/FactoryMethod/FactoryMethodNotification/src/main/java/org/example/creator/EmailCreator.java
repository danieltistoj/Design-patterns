package org.example.creator;

import org.example.Notification;
import org.example.products.Sms;

public class EmailCreator extends Creator {
    @Override
    public Notification createNotification() {
        return new Sms();
    }
}
