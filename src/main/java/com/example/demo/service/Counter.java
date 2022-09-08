package com.example.demo.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Counter {
	
	private AtomicInteger count = new AtomicInteger(0);

    @Scheduled(cron = "*/3 * * * * *")
    public void printHello() {
        this.count.incrementAndGet();
        System.out.println("Hello World");
    }

    public int getCount() {
        return this.count.get();
    }
}
