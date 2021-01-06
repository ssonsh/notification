package com.notification.demo.reader;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.Notification;
import com.notification.demo.domain.PushNotification;

public class PushNotificationReader extends AbstractNotificationReader{

    @Override
    public void read(Notification notification){
        PushNotification pushNotification = (PushNotification)notification;
        System.out.println("push readddddddddddd!" + pushNotification.toString());
    };

}
