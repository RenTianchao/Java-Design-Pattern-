package com.factory.factorymethod.order;

import com.factory.factorymethod.pizza.*;
import com.factory.simplefactory.classic.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
//            if (orderType.equals("BJCheese")){
//                pizza = new BJCheesePizza();
//                pizza.setName("BJCheesePizza");
//            } else if (orderType.equals("BJPepper")) {
//                pizza = new BJPepperPizza();
//                pizza.setName("BJPepperPizza");
//            } else if (orderType.equals("LDCheese")){
//                pizza = new LDCheesePizza();
//                pizza.setName("LDCheesePizza");
//            } else if (orderType.equals("LDPepper")) {
//                pizza = new LDPepperPizza();
//                pizza.setName("LDPepperPizza");
//            } else {
//                break;
//            }
        }while (true);

    }
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入披萨种类");
            String str = strin.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";

        }
    }

    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);
}
