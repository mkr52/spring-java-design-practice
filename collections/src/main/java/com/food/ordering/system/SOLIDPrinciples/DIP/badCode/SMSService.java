package com.food.ordering.system.SOLIDPrinciples.DIP.badCode;

public class SMSService {

    public void sendSMS(String message) {
        System.out.println("SMS notification sent: " + message);
    }
}
