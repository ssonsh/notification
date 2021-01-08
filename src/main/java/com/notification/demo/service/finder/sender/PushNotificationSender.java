package com.notification.demo.service.finder.sender;

import com.notification.demo.domain.notification.Notification;
import com.notification.demo.domain.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender {

    @Override
    public List<String> send(Notification notification){
        PushNotification pushNotification = (PushNotification) notification;
        System.out.println("push send!" + pushNotification.toString());

        return null;
    };

}
