package com.observer;

public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature,float pressure,float humidity){

        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println("temperature: "+ temperature);
        System.out.println("humidity: "+ humidity);
        System.out.println("pressure: "+ pressure);
    }


}
