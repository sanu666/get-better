package com.sanu.practice.multithreading;

public class RunnerHandler {

    public static void main(String[] args) {
//        MyThreadExtender myThread1 = new MyThreadExtender();
//        MyThreadExtender myThread2 = new MyThreadExtender();
//        MyThreadExtender myThread3 = new MyThreadExtender();
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();

//        MyThreadImplementer myThreadImplementer1 = new MyThreadImplementer();
//
//        Thread thread1 = new Thread(myThreadImplementer1,"first");
//        thread1.start();
//        Thread thread2 = new Thread(myThreadImplementer1,"Second");
//        thread2.start();
//        Thread thread3 = new Thread(myThreadImplementer1,"Third");
//        thread3.start();

        Thread threadUsingLambdas1  = new Thread(()->System.out.println(Thread.currentThread().getName()+ " hello"));
        Thread threadUsingLambdas2  = new Thread(()->System.out.println(Thread.currentThread().getName()+ " hello"));
        Thread threadUsingLambdas3  = new Thread(()->System.out.println(Thread.currentThread().getName()+ " hello"));

        threadUsingLambdas2.start();
        threadUsingLambdas1.start();
        threadUsingLambdas3.start();




    }

//    public static void main(String[] args) {
//
//    }
}
