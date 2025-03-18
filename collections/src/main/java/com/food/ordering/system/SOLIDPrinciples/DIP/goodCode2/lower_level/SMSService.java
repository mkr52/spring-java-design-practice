package com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2.lower_level;

public class SMSService implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("SMS notification sent: " + message);
    }
}
