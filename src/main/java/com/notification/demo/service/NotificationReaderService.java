package com.notification.demo.service;

import com.notification.demo.domain.notification.Notification;
import com.notification.demo.service.finder.reader.NotificationReader;
import com.notification.demo.service.finder.reader.NotificationReaderFinder;
import com.notification.demo.service.finder.reader.NotificationReaderFinderImpl;

public class NotificationReaderService {
    private NotificationReaderFinder notificationReaderFinder = new NotificationReaderFinderImpl();

    public void read(Notification notification){
        NotificationReader reader = notification.getReader(notificationReaderFinder);
        reader.read(notification);
    }
}
