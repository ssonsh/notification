package com.notification.demo.sender;

import com.notification.demo.domain.notification.Notification;

public interface NotificationSender {

    void send(Notification notification);
}
