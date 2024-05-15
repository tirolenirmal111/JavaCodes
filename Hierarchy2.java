package com.hierarchyInheritance;

public class Hierarchy2 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
class Animal{
    void eat(){System.out.println("Animal is eating");}
}
class Dog extends Animal{
    void bark(){System.out.println("dog is barking");}
}
class Cat extends Animal{
    void meow(){System.out.println(" cat is meowing");}
}
