package com.singleton.type;

import com.singleton.type.Singleton;

public class SingletonTest01 {
    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("jingtai changliang e han shi");
        System.out.println(instance == instance2);
        System.out.println("instance hashCode= "+ instance.hashCode());
        System.out.println("instance2 hashCode= "+instance2.hashCode());
    }
}
