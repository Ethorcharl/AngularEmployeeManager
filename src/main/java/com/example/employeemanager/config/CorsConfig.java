package com.example.employeemanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Замените на разрешенные домены
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Укажите разрешенные HTTP-методы
                .allowedHeaders("*") // Разрешите все заголовки
                .allowCredentials(true); // Разрешите передачу куки и заголовков авторизации
    }
}