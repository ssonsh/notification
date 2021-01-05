package com.notification.demo.domain;

import com.notification.demo.sender.AbstractNotificationSender;
import com.notification.demo.sender.NotificationSender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PushNotification  implements Notification{
    private String senderKey;
    private String senderName;

    @Override
    public AbstractNotificationSender getSender(NotificationSender notificationSender) {
        return notificationSender.getSender(this);
    }
}
