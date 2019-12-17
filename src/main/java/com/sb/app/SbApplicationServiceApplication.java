package com.sb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SbApplicationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbApplicationServiceApplication.class, args);
	}

}
