package com.notification.demo.reader;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.Notification;

public class EmailNotificationReader extends AbstractNotificationReader{

    @Override
    public void read(Notification notification){
        EmailNotification emailNotification = (EmailNotification)notification;
        System.out.println("email readddddddddddd!" + emailNotification.toString());
    };

}
