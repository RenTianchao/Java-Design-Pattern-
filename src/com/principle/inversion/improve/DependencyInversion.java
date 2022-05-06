package com.principle.inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件";
    }
}

class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "微信";
    }
}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}