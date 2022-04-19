package com.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;


    @Override
    public String getName() {
        return "计算机学院";
    }

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java","java 专业");
        addDepartment("Php","php 专业");
        addDepartment("Python","Python 专业");
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment+=1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
