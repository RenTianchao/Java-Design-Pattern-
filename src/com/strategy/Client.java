package com.strategy;

public class Client {
    public static void main(String[] args) {

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        pekingDuck.quack();
        pekingDuck.swim();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.swim();

        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();
        wildDuck.swim();
    }
}
