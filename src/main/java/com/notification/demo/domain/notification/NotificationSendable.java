package com.notification.demo.domain.notification;

import com.notification.demo.service.finder.sender.NotificationSenderFinder;
import com.notification.demo.service.finder.sender.NotificationSender;

public interface NotificationSendable {
    NotificationSender getSender(NotificationSenderFinder notificationSenderFinder);
}
