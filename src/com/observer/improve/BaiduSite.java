package com.observer.improve;

public class BaiduSite implements Observer{
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
        System.out.println("Baidu temperature: "+ temperature);
        System.out.println("Baidu humidity: "+ humidity);
        System.out.println("Baidu pressure: "+ pressure);
    }
}
