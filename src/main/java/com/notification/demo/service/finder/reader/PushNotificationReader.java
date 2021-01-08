package com.notification.demo.service.finder.reader;

import com.notification.demo.domain.notification.Notification;
import com.notification.demo.domain.notification.PushNotification;

public class PushNotificationReader implements NotificationReader {

    @Override
    public void read(Notification notification){
        PushNotification pushNotification = (PushNotification)notification;
        System.out.println("push readddddddddddd!" + pushNotification.toString());
    };

}
