package com.notification.demo.domain.notification.sender;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class EmailNotificationSender extends NotificationSender{
    private String name;
    private String emailAddress;
}
