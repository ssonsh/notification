package com.notification.demo;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.Notification;
import com.notification.demo.domain.PushNotification;
import com.notification.demo.domain.SmsNotification;
import com.notification.demo.service.NotificationReaderService;
import com.notification.demo.service.NotificationSenderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("======= Send End =======");
        List<Notification> notifications = Arrays.asList(
                new EmailNotification("ssh1224@midasin.com", "sson"),
                new PushNotification("ssh1224", "sson"),
                new EmailNotification("ajw????@midasin.com", "ajw"),
                new PushNotification("ajw????", "ajw"),
                new SmsNotification("01020574164", "ajw"),
                new SmsNotification("01020574164", "ajw")

        );

        NotificationSenderService notificationSenderService = new NotificationSenderService();
        notifications.forEach(notificationSenderService::send);

        System.out.println("======= Send End =======");

        System.out.println("======= Read Start =======");
        NotificationReaderService notificationReaderService = new NotificationReaderService();
        notifications.forEach(notificationReaderService::read);
        System.out.println("======= Read End =======");
    }
}
