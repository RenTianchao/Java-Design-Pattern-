package com.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args){
        System.out.println("shuangchong jiancha");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance hashCode = "+instance.hashCode());
        System.out.println("instance2 hashCode = "+instance2.hashCode());
    }
}
