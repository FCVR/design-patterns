package com.fcvr.dp.singleton;

public class EagerInitialization {

    private static final EagerInitialization INSTANCE= new EagerInitialization();
    
    private EagerInitialization(){
        //private constructor
    }
    
    public static EagerInitialization getInstance(){
        return INSTANCE;
    }
}
