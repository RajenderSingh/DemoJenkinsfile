package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.example.demo.DemoApplication;

@SpringJUnitConfig(DemoApplication.class)
public class CounterTest {

	@Autowired 
	Counter counter;

    @Test
    public void givenSleepBy100ms_whenGetInvocationCount_thenIsGreaterThanZero() 
      throws InterruptedException {
        Thread.sleep(10000L);

        assertThat(counter.getCount()).isGreaterThan(0);
    }
}