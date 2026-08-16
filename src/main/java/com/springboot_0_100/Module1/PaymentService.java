package com.springboot_0_100.Module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class PaymentService {
    void pay(){
        System.out.println("Paying");
    }

    @PostConstruct
    public void paymentInit() {
        System.out.println("before payment...");
    }

    @PreDestroy
    public void afterPayment() {
        System.out.println("payment is done...");
    }
}
