package com.example.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableCaching
@Configuration
public class CachingApplication {

	@Bean
	public CityManagerInterface dummyBean() {
		return new CityManager();
	}

	public static void main(String[] args) {
		SpringApplication.run(CachingApplication.class, args);
	}

}

