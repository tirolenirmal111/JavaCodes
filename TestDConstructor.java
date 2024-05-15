//Example of Default COnstructor Which Displays the Default values
package com.constructor;

public class TestDConstructor {
    int id;
    String name;
    TestDConstructor()
    {
        System.out.println("i am default");
    }
    void display(){
        System.out.println(id +","+name);
    }

    public static void main(String[] args) {
        TestDConstructor td=new TestDConstructor();
        td.display();

    }
}
