package com.giangbb.microservices.spingcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpingCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingCloudConfigServerApplication.class, args);
	}

}
