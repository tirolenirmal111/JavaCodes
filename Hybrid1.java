package com.hybridInheritance;

public class Hybrid1 {
    public static void main(String[] args) {
        C c = new C();
        c.display();

        System.out.println();

        D d = new D();
        d.display();
    }
}

class A {
    int a=1;
}

class B extends A {
    int b=2;
}

class C extends B{
    int c=3;
    int sum = a + b + c;
    public void display() {
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of c is " + c);
        System.out.println("The sum of a, b and c is " + sum);
    }
}
class D extends B {
    int d = 4;
    int sum = a + b + d;
    public void display() {
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of d is " + d);
        System.out.println("The sum of a, b and d is " + sum);
    }
}
