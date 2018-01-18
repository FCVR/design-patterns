package com.fcvr.dp.singleton;

public class ThreadSafe {

    private static ThreadSafe instance;
    
    private ThreadSafe(){
        //private constructor
    }
    
    public static synchronized ThreadSafe getInstance(){
        if(instance==null){
            instance= new ThreadSafe();
        }
        return instance;
    }
    
    // Above implementation works fine and provides thread-safety but it reduces the performance because of cost associated with the synchronized method, 
    // although we need it only for the first few threads who might create the separate instances 
    public static ThreadSafe getInstaceDoubleChecking(){
        if(instance==null){
            synchronized (ThreadSafe.class) {
                if (instance==null) {
                    instance = new ThreadSafe();
                }
            }
        }
        return instance;
    }
}

