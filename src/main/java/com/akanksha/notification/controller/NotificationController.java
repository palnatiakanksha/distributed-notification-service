package com.akanksha.notification.controller;

import com.akanksha.notification.kafka.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String sendNotification(@RequestBody String message) {
        producer.sendNotification(message);
        return "Notification sent!";
    }
}