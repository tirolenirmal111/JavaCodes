package com.staticBlock;

public class Student {
    String name;
    int rollNo;
    static String cllgName;

    //to set unique rollNo
    static int counter=0;
    public Student(String name){
        this.name=name;
        this.rollNo=setRollNo();
    }
    static int setRollNo()
    {
        counter++;
        return counter;
    }

    //static method
    static void  setCllgName(String name){
        cllgName=name;
    }

    //instance method
    void getStudentInfo()
    {
        System.out.println("name:"+this.name);
        System.out.println("rollNo:"+this.rollNo);
        System.out.println("cllgName:"+cllgName);
    }

}
