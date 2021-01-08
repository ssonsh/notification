package com.notification.demo.domain.notification;

import com.notification.demo.service.finder.reader.NotificationReaderFinder;
import com.notification.demo.service.finder.reader.NotificationReader;

public interface NotificationReadable {
    NotificationReader getReader(NotificationReaderFinder notificationReaderFinder);
}
