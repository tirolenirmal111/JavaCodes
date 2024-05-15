// Java program to demonstrate restriction on static methods
package com.staticBlock;

public class TestStaticMethod {
    static int a=10;
    int b=20;
    static void m1()
    {
        a=20;
        System.out.println("in m1");
        // Cannot make a static reference to the non-static field b
        //static int b=10;

        // Cannot make a static reference to the
        // non-static method m2() from the type Test
        //m2();

        //  Cannot use super in a static context
        System.out.println("super.a");
    }
    void m2()
    {
        System.out.println("from m2");
    }

    public static void main(String[] args) {


    }
}
