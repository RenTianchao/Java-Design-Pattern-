package com.observer.improve;

import com.observer.CurrentConditions;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;



    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){

        notifyObserver();
    }
    public  void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        if (observers.contains(o)){

            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {

        for (int i = 0;i < observers.size();i++){
            observers.get(i).update(getTemperature(),getPressure(),getHumidity());
        }
    }
}
