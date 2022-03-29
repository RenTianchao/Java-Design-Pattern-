package com.factory.factorymethod.order;

public class PizzaStore {

    public static void main(String[] args){

        String loc = "bj";
        if (loc.equals("bj")){
            new BJOrderPizza();//北京披萨
        }else if (loc.equals("ld")){
            new LDOrderPizza();//伦敦披萨
        }


    }
}
