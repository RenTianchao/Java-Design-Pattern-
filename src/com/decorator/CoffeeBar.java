package com.decorator;

public class CoffeeBar {
    public static void main(String[] args){

        //装饰器模式下的订单：2份巧克力，一份牛奶的LongBlack。
        Drink order = new LongBlack();
        //1。点一份LongBlack
        System.out.println("费用是 "+ order.cost());
        System.out.println("描述 "+ order.getDes());
        //2.加一份牛奶
        order = new Milk(order);
        System.out.println("费用是 "+ order.cost());
        System.out.println("描述 "+ order.getDes());
        //3.加一份巧克力
        order = new Chocolate(order);
        System.out.println("费用是 "+ order.cost());
        System.out.println("描述 "+ order.getDes());
        //4.加一份巧克力
        order = new Chocolate(order);
        System.out.println("费用是 "+ order.cost());
        System.out.println("描述 "+ order.getDes());

        System.out.println("=====================");
        Drink order2 = new DeCaf();
        //1。点一份DeCaf
        System.out.println("费用是 "+ order2.cost());
        System.out.println("描述 "+ order2.getDes());
        //2.加一份牛奶
        order2 = new Milk(order2);
        System.out.println("费用是 "+ order2.cost());
        System.out.println("描述 "+ order2.getDes());


    }
}
