package com.polymorphism;
//overloading by changing parameters
public class MethodOverloading1
{
    public static void main(String[] args)
    {
        MethodOverloading1 m=new MethodOverloading1();
        m.display(1);
        m.display(1,2);
    }
    public void display(int n)
    {
        System.out.println("Argument="+n);
    }
    public void display(int m,int n)
    {
        System.out.println("Argument="+m+","+n);
    }
}
