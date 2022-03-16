package com.singleton.type5;

public class SingletonTest5 {
    public static void main(String[] args){
        System.out.println("lanhanshi2,xiancheng buanquan.tongbu daimakuai");
        System.out.println("bu tuijian shiyong");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance hashCode = "+instance.hashCode());
        System.out.println("instance2 hashCode = "+instance2.hashCode());
    }
}
