package com.notification.demo.service;

import com.notification.demo.domain.Notification;
import com.notification.demo.sender.AbstractNotificationSender;
import com.notification.demo.sender.NotificationSenderImpl;
import com.notification.demo.sender.NotificationSender;

public class NotificationSenderService {

    private NotificationSender notificationSender = new NotificationSenderImpl();

    public void send(Notification notification){
        AbstractNotificationSender sender = notification.getSender(notificationSender);
        sender.send(notification);
    }
}
