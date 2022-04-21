package com.mediator;

public class TV extends Colleague{

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    @Override
    public void SendMessage(int stateChange) {

        this.getMediator().GetMessage(stateChange,this.name);
    }

    public void StartTv() {

        System.out.println("It is time to Start TV!");
    }
    public void StopTv() {

        System.out.println("It is time to Stop TV!");
    }

}
