package com.example.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}

//	@Bean
//	public CorsFilter corsFilter(){
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowCredentials(true);
//		configuration.setAllowedOrigins(Arrays.asList("https://localhost:4200"));
//		configuration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type","Accept","Authorization",
//				"Origin, Accept","X-Requested-With","Access-Control-Request-Method","Access-Control-Request-Headers"));
//		configuration.setExposedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type","Accept",
//				"Authorization", "Access-Control-Request-Credentials"));
//		configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		return new CorsFilter(source);
//	}
}
