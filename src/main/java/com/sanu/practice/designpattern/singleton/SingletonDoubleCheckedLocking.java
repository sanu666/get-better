package com.sanu.practice.designpattern.singleton;

public class SingletonDoubleCheckedLocking {

    private static SingletonDoubleCheckedLocking singletonDoubleCheckedLocking;

    private SingletonDoubleCheckedLocking(){

    }

    public static SingletonDoubleCheckedLocking getInstance(){
        if(singletonDoubleCheckedLocking==null){
            synchronized (SingletonDoubleCheckedLocking.class){
                if(singletonDoubleCheckedLocking==null){//Double checked Locking
                    singletonDoubleCheckedLocking = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return singletonDoubleCheckedLocking;
    }
}
