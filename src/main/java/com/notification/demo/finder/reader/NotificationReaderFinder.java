package com.notification.demo.finder.reader;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;
import com.notification.demo.reader.EmailNotificationReader;
import com.notification.demo.reader.PushNotificationReader;

public interface NotificationReaderFinder {
    EmailNotificationReader getReader(EmailNotification emailNotification);
    PushNotificationReader getReader(PushNotification pushNotification);
}
