package com.apigateway.cliente.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.modelmapper.ModelMapper;

@EnableScheduling
@SpringBootApplication
public class ClienteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
