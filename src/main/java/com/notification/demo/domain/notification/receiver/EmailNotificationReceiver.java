package com.notification.demo.domain.notification.receiver;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class EmailNotificationReceiver extends NotificationReceiver{
    private String key;						// 발송 순번 (ncp의 경우 String 값임으로 포괄적으로 String 사용)
    private String name;						// 수신자 이름
    private String address;					// 수신자 주소
    private String contents; 				// 수신 메세지 본문 내용
    private String status;					// 수신 상태 값 (success, fail)
    private LocalDateTime receiveDateTime;

}
