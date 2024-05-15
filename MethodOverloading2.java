package com.polymorphism;
//overloading by changing data type
public class MethodOverloading2
{
    public static void main(String[] args) {
        MethodOverloading2 m=new MethodOverloading2();
        m.display(17);
        m.display("Nirmal");
    }
    public void display(int n)
    {
        System.out.println(n);
    }
    public void display(String n)
    {
        System.out.println(n);
    }

}
