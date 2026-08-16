package com.springboot_0_100.Module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AppConfig {

    @Bean
//    @Scope("prototype")
    public PaymentService paymentService() {
        return  new PaymentService();
    }
}
