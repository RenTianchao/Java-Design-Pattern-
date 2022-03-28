package com.factory.simplefactory.classic;

public class CheessPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给CheessPizza准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给CheessPizza烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给CheessPizza切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给CheessPizza装盒");
    }
}
