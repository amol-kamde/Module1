package com.springboot_0_100.Module1.impl;

import com.springboot_0_100.Module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("emailNotif")
@Component
public class EmailNotificationService  implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Sending ..."+message);
    }
}
