package com.prototype.improve;



public class Client {
    public static void main(String[] args){
        //新的提升过的方法
        System.out.println("原型模式完成对对象的克隆");
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.friend = new Sheep("jack",2,"黑色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        //以下代码表明克隆对象只克隆了指向，没有复制相同的另一份。也就是浅拷贝。
        //
        System.out.println(sheep + "---" + sheep.friend.hashCode());
        System.out.println(sheep1 + "---" + sheep1.friend.hashCode());
        System.out.println(sheep2 + "---" + sheep2.friend.hashCode());
        System.out.println(sheep3 + "---" + sheep3.friend.hashCode());
        System.out.println(sheep4 + "---" + sheep4.friend.hashCode());


    }
}
