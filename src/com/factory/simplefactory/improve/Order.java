package com.factory.simplefactory.improve;



import com.factory.simplefactory.classic.OrderPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;//聚合。 聚合组合自己定
    Pizza pizza = null;
    String orderType = "";

    public Order(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public Order() {
        do {
            orderType = getType();
            pizza = simpleFactory.createPizza2(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("dinggou pisa shibai!");
                break;
            }
        } while (true);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入的
        this.simpleFactory = simpleFactory;//设置简单工厂对象
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("dinggou pisa shibai!");
                break;
            }
        } while (true);
    }
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("shuru pisa zhonglei");
            String str = strin.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";

        }
    }
    public static void main(String[] args){
        new Order( new SimpleFactory());
        System.out.println("exit program");
    }
}
