package com.demo.thread.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Thread2 extends Thread {


    @Autowired
    private ThreadCounterService counterService;

    @Override
    public void run() {
        counterService = new ThreadCounterService();
        counterService.loopCounting("Thread2");
    }



}
