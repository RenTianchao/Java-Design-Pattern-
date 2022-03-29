package com.factory.factorymethod.order;

import com.factory.factorymethod.pizza.*;

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("LDCheesePizza")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("LDPepperPizza")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
