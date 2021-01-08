package com.notification.demo.service.finder.sender;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.Notification;
import com.notification.demo.domain.notification.receiver.EmailNotificationReceivers;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public List<String> send(Notification notification){
        EmailNotification emailNotification = (EmailNotification)notification;

        System.out.println("======== Sender : " + getClass().getName());
        System.out.println("== receivers send start ==");
        EmailNotificationReceivers receivers = emailNotification.getReceivers();
        receivers.getValues().forEach(x -> System.out.println("\t>> send ]]] " + x.toString()));
        System.out.println("== receivers send end ==");

        List<String> result = Arrays.asList("1", "2", "3", "4", "5");
        return result;
    };
}
