package com.notification.demo.service;

import com.notification.demo.domain.Notification;
import com.notification.demo.reader.AbstractNotificationReader;
import com.notification.demo.reader.NotificationReader;
import com.notification.demo.reader.NotificationReaderImpl;

public class NotificationReaderService {
    private NotificationReader notificationReader = new NotificationReaderImpl();

    public void read(Notification notification){
        AbstractNotificationReader reader = notification.getReader(notificationReader);
        reader.read(notification);
    }
}
