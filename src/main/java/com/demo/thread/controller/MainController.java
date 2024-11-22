package com.demo.thread.controller;

import com.demo.thread.dto.Response;
import com.demo.thread.service.Async1;
import com.demo.thread.service.Async2;
import com.demo.thread.service.Thread1;
import com.demo.thread.service.Thread2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Thread1 thread1;

    @Autowired
    private Thread2 thread2;

    @Autowired
    private Async1 async1;

    @Autowired
    private Async2 async2;

    @PostMapping("/thread/start")
    public ResponseEntity<Response> createThread() {
        thread1 = new Thread1();
        thread2 = new Thread2();
        thread1.start();
//        while(thread1.isAlive()) {
//            System.out.println("Waiting..");
//        }
        thread2.start();
        return new ResponseEntity<>(new Response("success"), HttpStatus.OK);
    }

    @PostMapping("/async/start")
    public ResponseEntity<Response> startAsync() {
        async1 =  new Async1();
        async2 =  new Async2();
        async1.start();
        async2.start();
        return new ResponseEntity<>(new Response("success"), HttpStatus.OK);
    }
}
