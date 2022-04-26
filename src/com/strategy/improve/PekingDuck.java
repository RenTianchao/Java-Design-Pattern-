package com.strategy.improve;

public class PekingDuck extends Duck {
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {

        System.out.println("这是北京鸭");
    }

}
