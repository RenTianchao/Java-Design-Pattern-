package com.visitor;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价是失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人评价是失败");
    }
}
