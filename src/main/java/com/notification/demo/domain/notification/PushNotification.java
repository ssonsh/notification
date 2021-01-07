package com.notification.demo.domain.notification;

import com.notification.demo.reader.NotificationReader;
import com.notification.demo.finder.reader.NotificationReaderFinder;
import com.notification.demo.sender.NotificationSender;
import com.notification.demo.finder.sender.NotificationSenderFinder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PushNotification extends Notification{
    private String senderKey;
    private String senderName;

    @Override
    public NotificationSender getSender(NotificationSenderFinder notificationSenderFinder) {
        return notificationSenderFinder.getSender(this);
    }

    @Override
    public NotificationReader getReader(NotificationReaderFinder notificationReaderFinder) {
        return notificationReaderFinder.getReader(this);
    }
}
