package com.factory.factorymethod.order;

import com.factory.factorymethod.pizza.BJCheesePizza;
import com.factory.factorymethod.pizza.BJPepperPizza;
import com.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("BJCheesePizza")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("BJPepperPizza")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
