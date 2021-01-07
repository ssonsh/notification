package com.notification.demo.domain.notification;

import com.notification.demo.finder.reader.NotificationReaderFinder;
import com.notification.demo.reader.NotificationReader;

public interface NotificationReadable {
    NotificationReader getReader(NotificationReaderFinder notificationReaderFinder);
}
