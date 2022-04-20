package com.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);

        System.out.println("====1====");
        weatherData.setData(10f,100f,30.3f);

        System.out.println("====2====");
        BaiduSite baiduSite = new BaiduSite();
        weatherData.registerObserver(baiduSite);
        //weatherData.setData(1f,10f,3.03f);
        weatherData.dataChange();


        System.out.println("====3====");
        weatherData.removeObserver(baiduSite);
        //weatherData.setData(100f,1000f,300.03f);
        weatherData.dataChange();
    }
}
