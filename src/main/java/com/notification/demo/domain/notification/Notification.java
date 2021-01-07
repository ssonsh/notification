package com.notification.demo.domain.notification;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Notification implements NotificationSendable, NotificationReadable{
    private Integer sn;
    private String kind;
    private String title;
    private LocalDateTime registDateTime;
    private LocalDateTime sendDateTime;
}
