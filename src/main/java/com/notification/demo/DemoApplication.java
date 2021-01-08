package com.notification.demo;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.receiver.EmailNotificationReceiver;
import com.notification.demo.domain.notification.receiver.EmailNotificationReceivers;
import com.notification.demo.domain.notification.sender.EmailNotificationSender;
import com.notification.demo.service.NotificationSenderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private NotificationSenderService notificationSenderService = new NotificationSenderService();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // 1. Notification 객체 생성
        EmailNotification emailNotification = new EmailNotification("EMAIL", "테스트 발송 1", LocalDateTime.now());

        // 2. Notification Sender 정의 및 append
        EmailNotificationSender sender = EmailNotificationSender.builder()
                                                                .emailAddress("ssh1224@midasin.com")
                                                                .name("ssonsh")
                                                                .build();
        emailNotification.appendSender(sender);

        // 3. Notification Receivers 정의 및 append
        List<EmailNotificationReceiver> receivers = Arrays.asList(
                EmailNotificationReceiver.builder().name("받는사람1").address("11abc@midasin.com").contents("aabbccdd").build(),
                EmailNotificationReceiver.builder().name("받는사람2").address("22abc@midasin.com").contents("aabbccdd").build(),
                EmailNotificationReceiver.builder().name("받는사람3").address("33abc@midasin.com").contents("aabbccdd").build(),
                EmailNotificationReceiver.builder().name("받는사람4").address("44abc@midasin.com").contents("aabbccdd").build(),
                EmailNotificationReceiver.builder().name("받는사람5").address("55abc@midasin.com").contents("aabbccdd").build()
        );
        emailNotification.appendReceivers(EmailNotificationReceivers.builder().values(receivers).build());

        System.out.println("####################################");
        System.out.println(emailNotification.toString());
        System.out.println("####################################");

        // 4. NotificationService send 요청
        notificationSenderService.send(emailNotification);
    }
}
