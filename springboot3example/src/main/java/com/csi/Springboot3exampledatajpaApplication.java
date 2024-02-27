package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot3exampledatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3exampledatajpaApplication.class, args);
	}

}
