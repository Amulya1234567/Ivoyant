package com.ivoyant.threads;



import lombok.extern.slf4j.Slf4j;


public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread class: " + Thread.currentThread().getName());
    }
}



