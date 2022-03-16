package com.singleton.type3;

public class SingletonTest03 {

    public static void main(String[] args){
        System.out.println("lanhanshi1,xianchen bu anquan");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance hashCode = "+instance.hashCode());
        System.out.println("instance2 hashCode = "+instance2.hashCode());

    }
}
