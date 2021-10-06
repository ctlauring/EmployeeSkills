package com.employeeAPI.employeeskills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EmployeeSkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSkillsApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/employees/**").allowedOrigins("http://localhost:8081").allowedMethods("GET", "POST","PUT", "DELETE");
			}
		};
	}

}
