package com.notification.demo.domain;

import com.notification.demo.sender.AbstractNotificationSender;
import com.notification.demo.sender.NotificationSender;

public interface Notification {
    AbstractNotificationSender getSender(NotificationSender notificationSender);
}
