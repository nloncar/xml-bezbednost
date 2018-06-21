package com.example.AgentApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
@EnableJpaRepositories
public class AgentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgentAppApplication.class, args);
	}
}
