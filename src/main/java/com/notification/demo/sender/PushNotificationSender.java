package com.notification.demo.sender;

import com.notification.demo.domain.notification.Notification;
import com.notification.demo.domain.notification.PushNotification;

public class PushNotificationSender implements NotificationSender {

    @Override
    public void send(Notification notification){
        PushNotification pushNotification = (PushNotification) notification;
        System.out.println("push send!" + pushNotification.toString());
    };

}
