package com.company.hw17.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service

@Component
public class DateTimeChecker {

    @Scheduled(cron = "0/2 * * * * *")
    public void checkData() {
        System.out.println(LocalDateTime.now());
    }
}
