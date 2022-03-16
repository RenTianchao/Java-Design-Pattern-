package com.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args){
        System.out.println("shiyong jingtai neibulei wanchen danli moshi");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance hashCode = "+instance.hashCode());
        System.out.println("instance2 hashCode = "+instance2.hashCode());

    }
}
