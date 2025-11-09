package com.azienda.esempioMvc2.bin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempioMvc2.controller"})
public class EsempioMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(EsempioMvc2Application.class, args);
	}

}
