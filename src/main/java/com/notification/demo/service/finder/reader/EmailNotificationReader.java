package com.notification.demo.service.finder.reader;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.Notification;

public class EmailNotificationReader implements NotificationReader {

    @Override
    public void read(Notification notification){
        EmailNotification emailNotification = (EmailNotification)notification;
        System.out.println("email readddddddddddd!" + emailNotification.toString());
    };

}
