package com.company.hw17;

import com.company.hw17.app.runner.JavaConfig;
import com.company.hw17.service.Clock;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        context.getBean(Clock.class).turnOnClock();
    }
}