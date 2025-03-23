package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.SuhanService;



@Configuration
public class AppConfig {

    @Bean
    public SuhanService suhanConfig(){
        return new SuhanService();
    }
}
