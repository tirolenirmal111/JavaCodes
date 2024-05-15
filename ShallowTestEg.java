package com.constructor;

public class ShallowTestEg {
    public static void main(String[] args) {
        Abc obj1=new Abc();
        Abc obj2=obj1;     //it will copy the reference not value

        //updating the valur 6
        //using the reference variable st1
        obj1.x=6;

        System.out.println("the value of x is:"+obj1.x);

    }
}
