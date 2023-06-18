package com.sachin.GetEmailandAPIIntegration;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public MyObject myObject() {
        String name = "Sachin";
        int age = 24;
        return new MyObject(name, age);
    }
}
