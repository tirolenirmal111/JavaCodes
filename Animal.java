package com.singleInheritance;

public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class TestSingleInheritance{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
        Vehicle v=new Vehicle();
        v.start();
        Car c=new Car();
        c.start();
        Person p=new Person();
        p.display();
        Employee e=new Employee();
        e.display();
        Shape s=new Shape();
        System.out.println(s.getArea());
        Rectangle r=new Rectangle(5,5);
        System.out.println(r.getArea());
        BankAccount b=new BankAccount();
        b.display();
        SavingAccount sa=new SavingAccount();
        sa.display();
    }
}