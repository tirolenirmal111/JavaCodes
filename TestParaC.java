//program to understand parameterised constructor
package com.constructor;

public class TestParaC {
    int id ;
    String name;
    TestParaC(){
        System.out.println("I am Default");
    }
    TestParaC(int i, String n){
        id=i;
        name=n;
    }
    TestParaC(int i,String n,Float f){
        System.out.println(id+" "+name+" "+f);
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        TestParaC pc=new TestParaC(1705,"Nirmal");
        pc.display();
        TestParaC pc1=new TestParaC(509,"Kartik");
        pc1.display();
        TestParaC pc2=new TestParaC(175,"Nirmal",2.20f);
    }
}
