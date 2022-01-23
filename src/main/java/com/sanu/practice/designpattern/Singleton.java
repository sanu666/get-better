package com.sanu.practice.designpattern;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){
    }

//    public Singleton getSingleTonObject(){
//        if(singleton==null)
//            singleton=new Singleton();
//        return singleton;
//    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                //double checked locking - because second check of Singleton instance with lock
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
