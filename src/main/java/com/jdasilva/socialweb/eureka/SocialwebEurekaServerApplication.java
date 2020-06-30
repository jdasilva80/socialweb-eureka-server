package com.jdasilva.socialweb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SocialwebEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialwebEurekaServerApplication.class, args);
	}

}
