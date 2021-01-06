package com.notification.demo.reader;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.PushNotification;
import com.notification.demo.domain.SmsNotification;

public class NotificationReaderImpl implements NotificationReader{
    @Override
    public EmailNotificationReader getReader(EmailNotification emailNotification) {
        return new EmailNotificationReader();
    }

    @Override
    public PushNotificationReader getReader(PushNotification pushNotification) {
        return new PushNotificationReader();
    }

    @Override
    public SmsNotificationReader getReader(SmsNotification smsNotification) {
        return new SmsNotificationReader();
    }
}
