package com.factory.factorymethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给BJPepperPizza准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给BJPepperPizza烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给BJPepperPizza切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给BJPepperPizza装盒");
    }
}
