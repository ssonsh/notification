package com.notification.demo.service.finder.sender;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;

public class NotificationSenderFinderImpl implements NotificationSenderFinder {
    @Override
    public NotificationSender getSender(EmailNotification emailNotification) {
        return new EmailNotificationSender();
    }

    @Override
    public NotificationSender getSender(PushNotification pushNotification) {
        return new PushNotificationSender();
    }

}
