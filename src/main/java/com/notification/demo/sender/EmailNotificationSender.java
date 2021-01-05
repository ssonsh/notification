package com.notification.demo.sender;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.Notification;

public class EmailNotificationSender extends AbstractNotificationSender{

    @Override
    public void send(Notification notification){
        EmailNotification emailNotification = (EmailNotification)notification;
        System.out.println("email send!" + emailNotification.toString());
    };
}
