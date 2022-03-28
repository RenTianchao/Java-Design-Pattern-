package com.factory.simplefactory.improve;

public class SimpleFactory {
    //根据orderType返回一个对应的Pizza对象
    //简单工厂模式createPizza
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
        } else if (orderType.equals("chinese")){
            pizza = new ChinesePizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }
    //静态工厂模式createPizza2
    public static Pizza createPizza2(String orderType){
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
        }else if (orderType.equals("chinese")){
            pizza = new ChinesePizza();
            pizza.setName("中国披萨");
        }
        return pizza;

    }
}
