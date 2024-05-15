package com.constructor;

public class CopyC {
    int id;
    String name;
    CopyC(int i,String n){
        id=i;
        name=n;
    }
    CopyC(CopyC r){
        id=r.id;
        name=r.name;
    }
    void dislay(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyC c=new CopyC(111,"Raj");
        CopyC c1=new CopyC(c);
        c.dislay();
        c1.dislay();
    }
}
