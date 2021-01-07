package com.notification.demo.finder.reader;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;
import com.notification.demo.reader.EmailNotificationReader;
import com.notification.demo.reader.PushNotificationReader;

public class NotificationReaderFinderImpl implements NotificationReaderFinder {
    @Override
    public EmailNotificationReader getReader(EmailNotification emailNotification) {
        return new EmailNotificationReader();
    }

    @Override
    public PushNotificationReader getReader(PushNotification pushNotification) {
        return new PushNotificationReader();
    }

}
