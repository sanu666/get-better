package com.sanu.practice.multithreading;

public class MyThreadImplementer implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+666);
    }
}
