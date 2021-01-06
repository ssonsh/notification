package com.notification.demo.reader;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.PushNotification;
import com.notification.demo.domain.SmsNotification;

public interface NotificationReader {
    EmailNotificationReader getReader(EmailNotification emailNotification);
    PushNotificationReader getReader(PushNotification pushNotification);
    SmsNotificationReader getReader(SmsNotification smsNotification);
}
