package com.notification.demo.service.finder.sender;

import com.notification.demo.domain.notification.Notification;

import java.util.List;

public interface NotificationSender {

    List<String> send(Notification notification);
}
