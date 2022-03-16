package com.factory.simplefactory.classic;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("xila pisa");
            }else if (orderType.equals("cheese")){
                pizza = new CheessPizza();
                pizza.setName("nailao pisa");
            }else if (orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("hujiao pisa");
            }else if (orderType.equals("chinese")){
                pizza = new PepperPizza();
                pizza.setName("zhongguo pisa");
            }else {
                System.out.println("can not find pizza!");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType() {
        String pizzaType = "";
        return pizzaType;
    }

    public static void main(String[] args){
        new OrderPizza();

    }
}
