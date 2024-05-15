package com.staticBlock;

public class TestStatic {
    //static variable
    static int a=m1();

    //static block
    static{
        System.out.println("in static");
    }
    static int m1(){
        System.out.println("from m1");
        return 20;
    }

    //static method maain
    public static void main(String[] args) {
        System.out.println("value of a:"+a);
        System.out.println("in main");
    }
}
