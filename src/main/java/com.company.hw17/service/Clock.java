package com.company.hw17.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service

@Component
public class Clock {

    @Scheduled(cron = "0/2 * * * * *")
    public void turnOnClock() {
        System.out.println("Clock is working : " + new Date());
    }
}
