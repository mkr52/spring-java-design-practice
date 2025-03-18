package com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2;

import com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2.high_level.NotificationService;
import com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2.lower_level.EmailService;
import com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2.lower_level.SMSService;

/**
 * Good code adhering to Dependency Inversion Principle
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 * Here, NotificationService is a high-level module and it depends on an abstraction NotificationChannel.
 * EmailService and SMSService are low-level modules, and they implement the NotificationChannel interface.
 * NotificationService is not dependent on EmailService or SMSService. It is dependent on NotificationChannel.
 * This way, we can easily change the implementation of NotificationChannel without affecting NotificationService.
 * This is an example of Dependency Inversion Principle.
 */
public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailService());
        notificationService.notify("Hello World");

        NotificationService notificationService2 = new NotificationService(new SMSService());
        notificationService2.notify("Hello World");
    }
}
