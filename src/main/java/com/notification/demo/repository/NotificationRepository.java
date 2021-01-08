package com.notification.demo.repository;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.Notification;

import java.util.List;

public interface NotificationRepository {
    void save(EmailNotification emailNotification, List<String> sendKeys);
}
