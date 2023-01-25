package com.mss.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ReviewCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewCollectorApplication.class, args);
	}

}
