//Multiple Inheritance

package com.multipleInheritance;
interface Walkable{
    void walk();
}
interface Swimable{
    void swim();
}
class Duck implements Walkable,Swimable {
    public void walk() {
        System.out.println("duck is walking");
    }
    public void swim(){
        System.out.println("duck is swimming");
    }
}

public class multipleIn {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.swim();
        d.walk();
    }
}
