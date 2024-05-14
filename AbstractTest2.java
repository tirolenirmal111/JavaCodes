package com.abstractClass;

public class AbstractTest2 extends Bike2{

    public static void main(String[] args) {
            Bike2 obj=new AbstractTest2();
            obj.run();
    }

    @Override
    void run() {
        System.out.println("running fast");
    }
}
