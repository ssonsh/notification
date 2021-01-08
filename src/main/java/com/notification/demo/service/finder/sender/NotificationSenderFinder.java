package com.notification.demo.service.finder.sender;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;

public interface NotificationSenderFinder {
    NotificationSender getSender(EmailNotification emailNotification);
    NotificationSender getSender(PushNotification pushNotification);
}
