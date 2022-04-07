package com.decorator;

//具体的decorator，这里是巧克力 调味品
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3);
    }
}
