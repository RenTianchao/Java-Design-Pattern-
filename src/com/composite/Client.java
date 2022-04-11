package com.composite;

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "最好的大学");
        OrganizationComponent computerCollege1 = new College("计算机学院", "计算机学院第一");
        OrganizationComponent infoEngineerCollege2 = new College("信息工程学院", "信息工程学院第二");

        computerCollege1.add(new Department("软件工程", "软件工程不错1"));
        computerCollege1.add(new Department("网络工程", "网络工程不错2"));
        computerCollege1.add(new Department("计算机科学与技术", "王牌专业"));
        infoEngineerCollege2.add(new Department("信息工程", "信息工程很好学"));
        infoEngineerCollege2.add(new Department("通信工程", "通信工程不好学"));

        university.add(computerCollege1);
        university.add(infoEngineerCollege2);
        //university.print();
        //computerCollege1.print();
        infoEngineerCollege2.print();


    }
}
