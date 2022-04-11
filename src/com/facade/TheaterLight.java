package com.facade;

public class TheaterLight {
    private static  TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }
    public void dim(){
        System.out.println("TheaterLight is dim");
    }
    public void bright(){
        System.out.println("TheaterLight bright... ");
    }
}
