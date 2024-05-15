package com.singleInheritance;

public class Rectangle extends Shape{
   public int length=5;
    public int breadth=5;
    int area;

    Rectangle(int length,int breadth )
    {
        this.length=length;
        this.breadth=breadth;
    }
     public int getArea()
    {
        return length * breadth;
    }
}
