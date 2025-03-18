package com.food.ordering.system.SOLIDPrinciples.DIP.badCode;

/**
 * Bad code violating Dependency Inversion Principle
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 * Here, NotificationService is a high-level module and it depends on low-level modules EmailService and SMSService.
 * If we want to change the implementation of EmailService or SMSService, we need to change NotificationService as well.
 * This is an example of Dependency Inversion Principle violation.
 * // *
 * To fix this, we can create an interface NotificationChannel and make EmailService and SMSService implement it.
 * Then, we can modify NotificationService to depend on NotificationChannel instead of EmailService and SMSService.
 * This way, we can easily change the implementation of NotificationChannel without affecting NotificationService.
 * This is an example of Dependency Inversion Principle.
 *
 */
public class NotificationService {

    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void notify(String message, String channel) {
        if (channel.equalsIgnoreCase("email")) {
            emailService.sendEmail(message);
        } else if (channel.equalsIgnoreCase("sms")) {
            smsService.sendSMS(message);
        }
    }
}
