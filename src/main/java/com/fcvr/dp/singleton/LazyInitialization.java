package com.fcvr.dp.singleton;

public class LazyInitialization {

    private static LazyInitialization instance;
    
    private LazyInitialization(){
        //private constructor
    }
    
    //instance will be created when fist time this method is called
    public static LazyInitialization getInstance(){
        if(instance== null){
            instance= new LazyInitialization();
        }
        return instance;
    }
}
