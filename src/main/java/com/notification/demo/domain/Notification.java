package com.notification.demo.domain;

import com.notification.demo.reader.AbstractNotificationReader;
import com.notification.demo.reader.NotificationReader;
import com.notification.demo.sender.AbstractNotificationSender;
import com.notification.demo.sender.NotificationSender;

public interface Notification {
    AbstractNotificationSender getSender(NotificationSender notificationSender);
    AbstractNotificationReader getReader(NotificationReader notificationReader);
}
