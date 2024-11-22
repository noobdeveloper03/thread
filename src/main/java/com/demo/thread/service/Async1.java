package com.demo.thread.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Async1{


    @Autowired
    private ThreadCounterService counterService;

    public static int amount = 0;

    @Async
    public void start() {
        System.out.println("Starting " + Thread.currentThread().getName());
        counterService = new ThreadCounterService();
        counterService.increaseCounter("async1",amount);;
        System.out.println("Ending  " + Thread.currentThread().getName());
    }



}
