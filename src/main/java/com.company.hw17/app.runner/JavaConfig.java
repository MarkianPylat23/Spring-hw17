package com.company.hw17.app.runner;

import com.company.hw17.service.Clock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
public class JavaConfig {

    @Bean
    public Clock clock() {
        return new Clock();
    }
}
