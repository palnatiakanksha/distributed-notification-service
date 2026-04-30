package com.akanksha.notification.controller;

import com.akanksha.notification.kafka.NotificationProducer;
import com.akanksha.notification.model.NotificationRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationProducer producer;

    public NotificationController(NotificationProducer producer) {
        this.producer = producer;
    }

    @GetMapping
    public String test() {
        return "Application is running!";
    }

    @PostMapping
    public String sendNotification(@RequestBody NotificationRequest request) {
        producer.sendNotification(request.getMessage());
        return "Notification sent to " + request.getRecipient() + " via " + request.getChannel();
    }
}