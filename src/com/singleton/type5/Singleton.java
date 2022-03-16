package com.singleton.type5;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
