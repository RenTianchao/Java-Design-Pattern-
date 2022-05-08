package com.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("11 - 3 = "+ a.fun1(11,3));
        System.out.println("1 - 8 = "+ a.fun1(1,8));

        System.out.println("-------");
        B b = new B();
        System.out.println("11 + 3 = "+ b.fun1(11,3));
        System.out.println("1 + 8 = "+ b.fun1(1,8));
        System.out.println("11+3+9 = "+b.fun2(11,3));

        System.out.println("-------");
        System.out.println("11 - 3 = "+ b.fun3(11,3));
        System.out.println("1 - 8 = "+ b.fun3(1,8));
        System.out.println("11+3+9 = "+b.fun2(11,3));

    }
}

class Base{

}

class A extends Base{
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base{
    private A a = new A();

    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }

    public int fun3(int num1,int num2){
        return this.a.fun1(num1,num2);
    }
}