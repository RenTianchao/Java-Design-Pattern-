package com.factory.absfactory.pizzastore.order;

import com.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
