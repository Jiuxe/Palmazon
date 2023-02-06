package com.palmazon.Palmazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PalmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalmazonApplication.class, args);
	}

}
