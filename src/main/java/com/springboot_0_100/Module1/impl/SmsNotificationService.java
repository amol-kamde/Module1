package com.springboot_0_100.Module1.impl;

import com.springboot_0_100.Module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
//@Primary
//@Qualifier("smsNotif")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("sms sending.... "+message);
    }
}
