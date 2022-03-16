package com.factory.simplefactory.improve;

public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("shiyong jiandan gongchang moshi");
        if (orderType.equals("geek")){
            pizza = new GreekPizza();
            pizza.setName("xila pisa");
        } else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("nailao pisa");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("hujiao pisa");
        }
        return pizza;
    }
    public Pizza createPizza2(String orderType){
        Pizza pizza = null;
        System.out.println("shiyong jiandan gongchang moshi");
        if (orderType.equals("geek")){
            pizza = new GreekPizza();
            pizza.setName("xila pisa");
        } else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("nailao pisa");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("hujiao pisa");
        }
        return pizza;

    }
}
