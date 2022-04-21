package com.mediator;

public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {

        this.getMediator().GetMessage(stateChange,this.name);
    }

    public void StartCoffee() {
        System.out.println("It is time to Start CoffeeMachine!");
    }

    public void FinishCoffee() {
        System.out.println("It is time to Stop CoffeeMachine!");
    }
}
