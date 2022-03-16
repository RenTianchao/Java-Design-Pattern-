package com.factory.simplefactory.improve;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public Order(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public Order() {

    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
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
        new Order();
    }
}
