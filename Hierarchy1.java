package com.hierarchyInheritance;

public class Hierarchy1 {
    public static void main(String[] args) {
    Rectangle r=new Rectangle();
    r.displayRect();r.display();
    Square s=new Square();
    s.displaySq();s.display();
    Triangle t=new Triangle();
    t.displayTri();
    t.displayRect();
    t.display();
    Circle c=new Circle();
    c.displayCir();
    c.displaySq();
    c.display();
    }
}
class Shape{
    void display()
    {
        System.out.println("Display shape");
    }
}
class Rectangle extends Shape{
    void displayRect(){
        System.out.println("Display Rectangle");
    }
}
class Square extends Shape{
    void displaySq(){
        System.out.println("Display Square");
    }
}
class Triangle extends Rectangle{
    void displayTri(){
        System.out.println("Display Triangle");
    }
}
class Circle extends Square{
    void displayCir(){
        System.out.println("Display Circle");
    }
}