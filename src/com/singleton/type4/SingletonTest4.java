package com.singleton.type4;

public class SingletonTest4 {
    public static void main(String[] args){
        System.out.println("lanhanshi2,xiancheng anquan. tongbu fangfa");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance hashCode = "+instance.hashCode());
        System.out.println("instance2 hashCode = "+instance2.hashCode());
    }
}
