package com.notification.demo.domain.notification;

import com.notification.demo.finder.sender.NotificationSenderFinder;
import com.notification.demo.sender.NotificationSender;

public interface NotificationSendable {
    NotificationSender getSender(NotificationSenderFinder notificationSenderFinder);
}
