package com.demo.thread.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Async2 {


    @Autowired
    private ThreadCounterService counterService;

    @Async
    public void start() {
        System.out.println("Starting " + Thread.currentThread().getName());
        counterService = new ThreadCounterService();
        counterService.loopCounting("Async2");
        System.out.println("Ending " + Thread.currentThread().getName());
    }



}
