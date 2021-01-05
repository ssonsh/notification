package com.notification.demo.sender;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.Notification;
import com.notification.demo.domain.PushNotification;

public class PushNotificationSender extends AbstractNotificationSender{

    @Override
    public void send(Notification notification){
        PushNotification pushNotification = (PushNotification) notification;
        System.out.println("push send!" + pushNotification.toString());
    };

}
