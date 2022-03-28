package com.factory.simplefactory.classic;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给GreekPizza准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给GreekPizza烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给GreekPizza切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给GreekPizza装盒");
    }
}
