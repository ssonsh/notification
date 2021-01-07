package com.notification.demo.service;

import com.notification.demo.domain.notification.Notification;
import com.notification.demo.reader.NotificationReader;
import com.notification.demo.finder.reader.NotificationReaderFinder;
import com.notification.demo.finder.reader.NotificationReaderFinderImpl;

public class NotificationReaderService {
    private NotificationReaderFinder notificationReaderFinder = new NotificationReaderFinderImpl();

    public void read(Notification notification){
        NotificationReader reader = notification.getReader(notificationReaderFinder);
        reader.read(notification);
    }
}
