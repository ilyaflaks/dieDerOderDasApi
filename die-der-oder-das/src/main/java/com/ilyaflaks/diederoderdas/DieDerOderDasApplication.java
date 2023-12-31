package com.ilyaflaks.diederoderdas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DieDerOderDasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DieDerOderDasApplication.class, args);
		System.out.println("Application started on port 5000");
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*")
						.allowedOrigins("http://diederoderdas.s3-website-us-west-1.amazonaws.com");

			}
		};
	}
}
