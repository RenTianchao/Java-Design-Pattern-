package com.factory.simplefactory.classic;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class ChineasPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("给中国披萨准备原材料");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("给中国披萨烘焙");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("给中国披萨切割");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("给中国披萨装盒");
    }
}
