package com.polymorphism;

public class MethodOverridding1 {
    public static void main(String[] args)
    {
        MethodOverridding1 m=new MethodOverridding1();
        Child pi=new Child();
        pi.prints();
        Child1 p=new Child1();
        p.prints();
    }
}
class Parents{
    void prints()
    {
        System.out.println("Display of Parent");
    }
}
class Child extends Parents{
    void prints()
    {
        System.out.println("Display of child");
    }
}
class Child1 extends Parents{
    void prints()
    {
        System.out.println("Display of child 1");
    }
}
