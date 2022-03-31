package com.prototype.improve;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String address = "蒙古";
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //这里是修改编辑器之后自己写的。
//
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }

//这里是编辑器帮忙写的。一个没改，可能会报异常。
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Sheep sheep = null;
//        sheep = (Sheep)super.clone();
//        return sheep;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
