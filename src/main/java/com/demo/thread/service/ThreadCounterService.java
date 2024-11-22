package com.demo.thread.service;

import org.springframework.stereotype.Service;

@Service
public class ThreadCounterService {

    public void increaseCounter(String threadName,int amount) {
        for(int ctr=0;ctr<99;ctr++) {
            System.out.println(threadName + " Increasing Counter = " + amount);
            amount++;
        }
    }

    public void loopCounting(String threadName) {
        for(int ctr=0;ctr<99;ctr++) {
            System.out.println(threadName + " Counting = " + ctr);
        }
    }
}
