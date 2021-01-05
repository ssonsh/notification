package com.notification.demo.sender;

import com.notification.demo.domain.EmailNotification;
import com.notification.demo.domain.PushNotification;
import com.notification.demo.domain.SmsNotification;

public interface NotificationSender {
    EmailNotificationSender getSender(EmailNotification emailNotification);
    PushNotificationSender getSender(PushNotification pushNotification);
    SmsNotificationSender getSender(SmsNotification smsNotification);
}
