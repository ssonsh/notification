package com.notification.demo.finder.sender;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;
import com.notification.demo.sender.EmailNotificationSender;
import com.notification.demo.sender.PushNotificationSender;

public class NotificationSenderFinderImpl implements NotificationSenderFinder {
    @Override
    public EmailNotificationSender getSender(EmailNotification emailNotification) {
        return new EmailNotificationSender();
    }

    @Override
    public PushNotificationSender getSender(PushNotification pushNotification) {
        return new PushNotificationSender();
    }

}
