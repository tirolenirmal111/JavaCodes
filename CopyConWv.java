//Copying the value without constructor
package com.constructor;

public class CopyConWv {
    int id;
    String name;
    CopyConWv(int n,String s){
        id=n;
        name=s;
    }
    CopyConWv()
    {

    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyConWv cv=new CopyConWv(123,"karan");
        CopyConWv cv1=new CopyConWv();
        cv1.id=cv.id;
        cv1.name=cv.name;
        cv.display();
        cv1.display();
    }
}
