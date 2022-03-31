package com.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarger = new DeepCloneableTarger("大牛","小牛类");

//        //方式一 完成深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//
//        System.out.println(p.name+" --- "+p.deepCloneableTarger.hashCode());
//        System.out.println(p2.name+" --- "+p2.deepCloneableTarger.hashCode());

        //方式二 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepclone();

        System.out.println(p.name+" --- "+p.deepCloneableTarger.hashCode());
        System.out.println(p2.name+" --- "+p2.deepCloneableTarger.hashCode());


    }
}
