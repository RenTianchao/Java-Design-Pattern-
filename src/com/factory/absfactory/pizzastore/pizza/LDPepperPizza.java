package com.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给LDPepperPizza准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给LDPepperPizza烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给LDPepperPizza切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给LDPepperPizza装盒");
    }
}
