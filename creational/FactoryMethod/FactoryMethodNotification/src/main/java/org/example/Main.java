package org.example;

import org.example.creator.Creator;
import org.example.creator.EmailCreator;
import org.example.creator.SmsCreator;

public class Main {
    public static void main(String[] args) {
        Creator creatorEmail = new EmailCreator();
        Notification email = creatorEmail.createNotification();
        email.send("email message");

        Creator creatorSms = new SmsCreator();
        Notification sms = creatorSms.createNotification();
        sms.send("sms message");
    }
}