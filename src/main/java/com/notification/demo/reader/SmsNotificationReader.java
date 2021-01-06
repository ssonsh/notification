package com.notification.demo.reader;

import com.notification.demo.domain.Notification;
import com.notification.demo.domain.PushNotification;
import com.notification.demo.domain.SmsNotification;

public class SmsNotificationReader extends AbstractNotificationReader{

    @Override
    public void read(Notification notification){
        SmsNotification smsNotification = (SmsNotification) notification;
        System.out.println("sms readddddddddddd!" + smsNotification.toString());
    };

}
