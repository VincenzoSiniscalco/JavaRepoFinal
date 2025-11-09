package com.azienda.esempioRest2.bin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.azienda.esempioRest2.controller","com.azienda.esempioRest2.service"})
public class EsempioRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(EsempioRest2Application.class, args);
	}

}
