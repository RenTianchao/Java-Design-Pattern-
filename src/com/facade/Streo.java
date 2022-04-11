package com.facade;

public class Streo {
    private static  Streo instance = new Streo();

    public static Streo getInstance() {
        return instance;
    }
    public void up(){
        System.out.println("Streo is up");
    }
    public void down(){
        System.out.println("Streo down... ");
    }
    public void on(){
        System.out.println("Streo on");
    }
    public void off(){
        System.out.println("Streo off");
    }
}
