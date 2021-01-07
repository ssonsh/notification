package com.notification.demo.finder.sender;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.PushNotification;
import com.notification.demo.sender.EmailNotificationSender;
import com.notification.demo.sender.PushNotificationSender;

public interface NotificationSenderFinder {
    EmailNotificationSender getSender(EmailNotification emailNotification);
    PushNotificationSender getSender(PushNotification pushNotification);
}
