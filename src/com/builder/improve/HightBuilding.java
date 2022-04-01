package com.builder.improve;

public class HightBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基10米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");

    }

    @Override
    public void roofed() {
        System.out.println("高楼透明屋顶");

    }
}
