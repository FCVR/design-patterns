package com.fcvr.dp.singleton;

public class StaticBlock {

    private static StaticBlock instance;
    
    //In this way we can handle handle exception in instance creation 
    static{
        
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            // TODO: handle exception
        };
    }
    
    private StaticBlock(){
        //private constructor
    }
    
    public static StaticBlock getInstance(){
        return instance;
    }
}
