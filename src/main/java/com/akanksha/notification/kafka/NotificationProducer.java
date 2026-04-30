package com.akanksha.notification.kafka;

import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {

    public void sendNotification(String message) {
        // For now, just print (later we will connect Kafka)
        System.out.println("Sending notification: " + message);
    }
}