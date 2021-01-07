package com.notification.demo.sender;

import com.notification.demo.domain.notification.EmailNotification;
import com.notification.demo.domain.notification.Notification;
import com.notification.demo.domain.notification.receiver.EmailNotificationReceivers;

public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(Notification notification){
        EmailNotification emailNotification = (EmailNotification)notification;

        System.out.println("======== Sender : " + getClass().getName());
        System.out.println("== receivers send start ==");
        EmailNotificationReceivers receivers = emailNotification.getReceivers();
        receivers.getValues().forEach(x -> System.out.println("\t>> send ]]] " + x.toString()));
        System.out.println("== receivers send end ==");

        System.out.println("== notification save start ==");
        System.out.println("\t>> kind : " + emailNotification.getKind());
        System.out.println("\t>> title : " + emailNotification.getTitle());
        System.out.println("\t>> registDatetime : " + emailNotification.getRegistDateTime());

        System.out.println("== notification save end ==");
    };
}
