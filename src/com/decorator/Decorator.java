package com.decorator;

public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();//写错了，写成了super.getPrice() + drink.getPrice()
    }

    @Override
    public String getDes() {
        return super.getDes()+" "+ super.getPrice() + "&&" +drink.getDes();
    }
}
