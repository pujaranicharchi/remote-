package com.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoteApplication {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		SpringApplication.run(RemoteApplication.class, args);
	}

}
