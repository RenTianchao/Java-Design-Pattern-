package com.strategy.improve;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    public abstract void display();

    public void quack(){
        System.out.println("鸭子会叫");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
