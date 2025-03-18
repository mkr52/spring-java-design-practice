package com.food.ordering.system.SOLIDPrinciples.DIP.badCode;

public class EmailService {

    public void sendEmail(String message) {
        System.out.println("Email notification sent: " + message);
    }
}
