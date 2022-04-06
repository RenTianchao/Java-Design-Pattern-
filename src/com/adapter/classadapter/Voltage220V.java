package com.adapter.classadapter;

//被适配的类
public class Voltage220V {
    // output 220v
    public int output220V(){
        int src = 220;
        System.out.println("电压 = "+src+"伏");
        return src;
    }

}
