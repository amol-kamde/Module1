package com.springboot_0_100.Module1;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {
//	@Autowired
//	PaymentService paymentService1 = null;

//	@Autowired
//	PaymentService paymentService2 = null;

	//	@Autowired
	final NotificationService notificationService;
//
	Module1Application(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

//	@Autowired
//	Map<String, NotificationService> notificationServiceMap = new HashMap<>();


	public static void main(String[] args) {
		getEnvConfig();
		SpringApplication.run(Module1Application.class, args);
//		System.out.println("run first this main method");
	}

	@Override
	public void run(String[] args) throws Exception {
//		System.out.println("run first this run method");
//		System.out.println(paymentService1.hashCode());
//		System.out.println(paymentService2.hashCode());
//
//		paymentService1.pay();
//		paymentService1.pay();

		notificationService.send("Hello");

//		for (var notificationService : notificationServiceMap.entrySet()) {
//			System.out.println(notificationService.getKey());
//
//			notificationService.getValue().send("Hello");
//		}
	}

	public static void getEnvConfig() {
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();
		dotenv.entries().forEach(entry ->
					System.setProperty(entry.getKey(), entry.getValue())
				);
	}
}
