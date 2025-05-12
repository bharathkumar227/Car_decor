package com.car.cardecor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.car.cardecor", "com.car.controller"}, exclude = {DataSourceAutoConfiguration.class})
public class CardecorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardecorApplication.class, args);
	}

}
