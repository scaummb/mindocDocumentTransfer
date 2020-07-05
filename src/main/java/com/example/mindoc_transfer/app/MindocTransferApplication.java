package com.example.mindoc_transfer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = {"com.example.mindoc_transfer.core.*"})
public class MindocTransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(MindocTransferApplication.class, args);
	}

}
