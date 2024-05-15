package com.multiLevel;

public class MultiLevel3 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.start();
        Car c=new Car();
        c.drive();c.start();
        SportsCar sc=new SportsCar();
        sc.start();sc.drive();
    }
}
class Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car driving");
    }
}
class SportsCar extends Car{
    void drive(){
        System.out.println("Sports Car driving");
    }
}
