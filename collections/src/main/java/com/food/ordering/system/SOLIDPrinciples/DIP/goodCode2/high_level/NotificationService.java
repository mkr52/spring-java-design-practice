package com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2.high_level;

import com.food.ordering.system.SOLIDPrinciples.DIP.goodCode2.lower_level.NotificationChannel;

public class NotificationService {

    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String message) {
        notificationChannel.send(message);
    }
}
