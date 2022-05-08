package com.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工 "+i);
            list.add(emp);
        }
        return list;
    }

    //改变成了这里的函数
    public void printEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("-----学院员工------");
        for (CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
    }

}

class SchoolManager{ //直接朋友Employee CollegeManager
    public List<Employee> getAllEmployee(){
        List<Employee> list =  new ArrayList<Employee>();
        for (int i = 0;i< 5;i++){
            Employee emp = new Employee();
            emp.setId("学校总部员工 "+i);
            list.add(emp);
        }
        return list;

    }

    void printAllEmployee(CollegeManager sub){
        sub.printEmployee();
//        CollegeEmployee不是直接朋友  局部变量不是直接朋友
//        List<CollegeEmployee> list1 = this.getAllEmployee();
//        System.out.println("-----学院员工------");
//        for (CollegeEmployee e : list1){
//            System.out.println(e.getId());
//        }


        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----学院总部员工------");
        for (Employee e : list2){
            System.out.println(e.getId());
        }
    }
}