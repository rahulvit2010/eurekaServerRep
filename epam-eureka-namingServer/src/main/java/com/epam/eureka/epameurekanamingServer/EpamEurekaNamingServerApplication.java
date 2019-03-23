package com.epam.eureka.epameurekanamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EpamEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpamEurekaNamingServerApplication.class, args);
	}

}
