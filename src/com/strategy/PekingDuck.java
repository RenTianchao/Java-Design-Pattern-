package com.strategy;

public class PekingDuck extends Duck{
    @Override
    public void display() {

        System.out.println("这是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("这是北京鸭,不能飞翔");
    }
}
