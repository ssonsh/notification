package com.notification.demo.domain.notification.receiver;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EmailNotificationReceivers {
    private List<EmailNotificationReceiver> values;

    public String toString(){
        return values.toString();
    }
}
