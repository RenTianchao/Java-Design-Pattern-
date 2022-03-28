package com.factory.simplefactory.improve;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给PepperPizza准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给PepperPizza烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给PepperPizza切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给PepperPizza装盒");
    }
}
