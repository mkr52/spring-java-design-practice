package com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2;

public class EmailService implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Email notification sent: " + message);
    }
}
