package com.notification.demo.repository;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.Notification;

import java.util.List;

public class NotificationRepositoryImpl implements NotificationRepository{
    @Override
    public void save(EmailNotification emailNotification, List<String> sendKeys) {
        System.out.println("== notification save (Repository) start ==");
        System.out.println("\t>> kind : " + emailNotification.getKind());
        System.out.println("\t>> title : " + emailNotification.getTitle());
        System.out.println("\t>> registDatetime : " + emailNotification.getRegistDateTime());
        System.out.println("\t>> sendKeys : " + sendKeys.toString());
        System.out.println("== notification save (Repository) end ==");
    }
}
