package com.polymorphism;
//overloading the constructor
public class MethodOverloadingAdd
{
    MethodOverloadingAdd(String s,int n)
    {
        System.out.println(s+","+n);
    }
    MethodOverloadingAdd(String s,int n,long m)
    {
        System.out.println(s+","+n+","+m);
    }

    public static void main(String[] args) {
        MethodOverloadingAdd a=new MethodOverloadingAdd("Nirmal",17);
        MethodOverloadingAdd ad=new MethodOverloadingAdd("Nirmal",17,9399275103l);
    }
}

