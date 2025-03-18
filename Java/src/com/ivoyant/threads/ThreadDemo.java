package com.ivoyant.threads;

public class ThreadDemo {
    public static void main(String[] args) {

            MyThread t1=new MyThread();
            t1.start();

            Runnable runnable=new MyRunnable();
            Thread t2=new Thread(runnable);
            t2.start();
        }
}

