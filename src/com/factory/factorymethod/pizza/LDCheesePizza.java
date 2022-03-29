package com.factory.factorymethod.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给LDCheesePizza准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给LDCheesePizza烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给LDCheesePizza切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给LDCheesePizza装盒");
    }
}
