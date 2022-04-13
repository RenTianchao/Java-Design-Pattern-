package com.template.improve;

public class Client {

    public static void main(String[] args){
        System.out.println("-----制作红豆豆浆---");
        SoyaMilk redBeanSoyMilk = new RedBeanSoyaMilk();
        redBeanSoyMilk.make();

        System.out.println("-----制作花生豆浆---");
        SoyaMilk peanutSoyamilk = new PeanutSoyaMilk();
        peanutSoyamilk.make();

        System.out.println("-----制作纯豆浆---");
        SoyaMilk pureSoyamilk = new PureSoyaMilk();
        pureSoyamilk.make();
    }
}
