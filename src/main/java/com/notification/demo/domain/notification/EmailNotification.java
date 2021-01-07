package com.notification.demo.domain.notification;

import com.notification.demo.domain.notification.receiver.EmailNotificationReceivers;
import com.notification.demo.domain.notification.sender.EmailNotificationSender;
import com.notification.demo.reader.NotificationReader;
import com.notification.demo.finder.reader.NotificationReaderFinder;
import com.notification.demo.sender.NotificationSender;
import com.notification.demo.finder.sender.NotificationSenderFinder;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class EmailNotification extends Notification{
    private EmailNotificationSender sender;
    private EmailNotificationReceivers receivers;

    public EmailNotification(String kind, String title, LocalDateTime registDateTime) {
        super.setKind(kind);
        super.setTitle(title);
        super.setRegistDateTime(registDateTime);
    }

    @Override
    public NotificationSender getSender(NotificationSenderFinder notificationSenderFinder) {
        return notificationSenderFinder.getSender(this);
    }

    @Override
    public NotificationReader getReader(NotificationReaderFinder notificationReaderFinder) {
        return notificationReaderFinder.getReader(this);
    }

    public void appendSender(EmailNotificationSender sender) {
        this.sender = sender;
    }

    public void appendReceivers(EmailNotificationReceivers receivers) {
        this.receivers = receivers;
    }
}
