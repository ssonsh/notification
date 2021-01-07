package com.notification.demo.domain.notification.sender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PushNotificationSender extends NotificationSender{
    private Integer sn;
    private String name;
}
