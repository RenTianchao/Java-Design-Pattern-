package com.principle.singleresponsivility;

public class SingleResponsivility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。 ");
    }
}
