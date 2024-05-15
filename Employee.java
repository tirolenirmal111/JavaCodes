package com.singleInheritance;

public class Employee extends Person{
    int salary=25000;
    void display(){
        System.out.println(name+","+age+","+salary);
    }
}
