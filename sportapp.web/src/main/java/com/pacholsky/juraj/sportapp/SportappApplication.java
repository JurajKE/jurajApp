package com.pacholsky.juraj.sportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EntityScan("com.pacholsky.juraj.sportapp.entity")
@EnableJpaRepositories("com.pacholsky.juraj.sportapp.repository")
public class SportappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportappApplication.class, args);
	}

}

//spring.jpa.hibernate.ddl-auto=update
//spring.datasource.url=jdbc:postgresql://localhost/music

