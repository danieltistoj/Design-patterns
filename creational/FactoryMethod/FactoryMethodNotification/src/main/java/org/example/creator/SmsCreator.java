package org.example.creator;

import org.example.Notification;
import org.example.products.Email;

public class SmsCreator extends Creator{
    @Override
    public Notification createNotification() {
        return new Email();
    }
}
