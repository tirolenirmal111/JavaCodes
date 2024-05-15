package com.multiLevel;

public class MultiLevel2
{
    public static void main(String[] args)
    {
        Manager m=new Manager();
        m.display();
    }

}
class Person
{
    String name="Nirmal";
    int age=22;
    void display(){
        System.out.println(name+","+age);
    }
}
class Employee extends Person{
    int salary=10000;
    void display(){
        System.out.println(name+","+age+","+salary);
    }
}
class Manager extends Employee{
    String dept="Java";
    void display(){
        System.out.println(name+","+age+","+salary+","+dept);
    }
}