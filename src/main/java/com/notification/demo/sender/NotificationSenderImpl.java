package com.notification.demo.sender;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.PushNotification;
import com.notification.demo.domain.SmsNotification;

public class NotificationSenderImpl implements NotificationSender{
    @Override
    public EmailNotificationSender getSender(EmailNotification emailNotification) {
        return new EmailNotificationSender();
    }

    @Override
    public PushNotificationSender getSender(PushNotification pushNotification) {
        return new PushNotificationSender();
    }

    @Override
    public SmsNotificationSender getSender(SmsNotification smsNotification) {
        return new SmsNotificationSender();
    }
}
