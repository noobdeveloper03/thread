package com.demo.thread.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Thread1 extends Thread {


    @Autowired
    private ThreadCounterService counterService;

    public static int amount = 0;

    @Override
    public void run() {
        counterService = new ThreadCounterService();
        counterService.increaseCounter("Thread1",amount);;
    }



}
