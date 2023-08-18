package com.company.recordstoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableResourceServer
public class RecordStoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordStoreApiApplication.class, args);
	}

}
