package com.notification.demo.service.finder.reader;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;

public interface NotificationReaderFinder {
    EmailNotificationReader getReader(EmailNotification emailNotification);
    PushNotificationReader getReader(PushNotification pushNotification);
}
