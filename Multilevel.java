package com.multiLevel;

public class Multilevel {
    public static void main(String[] args) {
        BabyDog b=new BabyDog();
        b.weep();
        b.bark();
        b.eat();
    }
}
class Animal{
    void eat()
    {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Dog is weeping");
    }
}
