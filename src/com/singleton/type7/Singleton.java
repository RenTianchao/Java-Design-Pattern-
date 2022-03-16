package com.singleton.type7;

public class Singleton {
    private static volatile Singleton instance;
    private Singleton(){}
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
