package com.notification.demo.service;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.Notification;
import com.notification.demo.repository.NotificationRepository;
import com.notification.demo.repository.NotificationRepositoryImpl;
import com.notification.demo.service.finder.sender.NotificationSender;
import com.notification.demo.service.finder.sender.NotificationSenderFinder;
import com.notification.demo.service.finder.sender.NotificationSenderFinderImpl;

import java.util.List;

public class NotificationSenderService {

    private NotificationSenderFinder notificationSenderFinder = new NotificationSenderFinderImpl();
    private NotificationRepository notificationRepository = new NotificationRepositoryImpl();

    public void send(Notification notification){
        System.out.println("$$$$$ notification save start $$$$$");

        // find Sender & send
        NotificationSender sender = notification.getSender(notificationSenderFinder);
        List<String> sendKeys = sender.send(notification);

        // save notification
        notificationRepository.save((EmailNotification) notification, sendKeys);
        System.out.println("$$$$$ notification save end $$$$$");
    }
}
