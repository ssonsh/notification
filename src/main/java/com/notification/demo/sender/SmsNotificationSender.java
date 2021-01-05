package com.notification.demo.sender;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.Notification;
import com.notification.demo.domain.SmsNotification;

public class SmsNotificationSender extends AbstractNotificationSender{

    @Override
    public void send(Notification notification){
        SmsNotification smsNotification = (SmsNotification)notification;
        System.out.println("sms! send!" + smsNotification.toString());
    };
}
