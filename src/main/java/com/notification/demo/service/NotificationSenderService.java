package com.notification.demo.service;

import com.notification.demo.domain.notification.Notification;
import com.notification.demo.sender.NotificationSender;
import com.notification.demo.finder.sender.NotificationSenderFinderImpl;
import com.notification.demo.finder.sender.NotificationSenderFinder;

public class NotificationSenderService {

    private NotificationSenderFinder notificationSenderFinder = new NotificationSenderFinderImpl();

    public void send(Notification notification){
        NotificationSender sender = notification.getSender(notificationSenderFinder);
        sender.send(notification);
    }
}
