package com.azienda.esempioRest.bin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.azienda.esempioRest.controller")
public class EsempioRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsempioRestApplication.class, args);
	}

}
