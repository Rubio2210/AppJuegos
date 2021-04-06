package com.jueguitos.AppJuegos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppJuegosApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppJuegosApplication.class, args);
		System.out.println(System.getProperty("loltoken"));
	}

}
