package com.akanksha.notification.controllerontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NotificationController {

    @GetMapping("/hello")
    public String hello() {
        return "Application is running!";
    }
}