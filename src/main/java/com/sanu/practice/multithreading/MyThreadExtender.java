package com.sanu.practice.multithreading;

public class MyThreadExtender extends Thread{

    @Override
    public void run() {
//        for(int i=0;i<=5;i++){

            System.out.println(Thread.currentThread().getName()+" "+666);
//        }
    }
}
