package com.addvicorg.well;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.addvicorg")
public class HmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(HmsApplication.class, args);
		//make change in remote 
	}

}
