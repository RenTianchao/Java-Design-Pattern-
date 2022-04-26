package com.strategy.improve;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();

        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.display();
        pekingDuck.fly();

        pekingDuck.setFlyBehavior(new GoodFlyBehavior());
        pekingDuck.display();
        pekingDuck.fly();


    }
}
