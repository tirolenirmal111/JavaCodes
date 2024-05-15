package com.multipleInheritance;
interface A{
    public abstract void execute2();
}
interface B{
    public abstract void execute2();
}
class C implements A,B{
    public void execute1()
    {
        System.out.println("from exe 1");
    }
    public void execute2(){
        System.out.println("from exe 2");
    }
}
public class Multiple3 {
    public static void main(String[] args) {
        C c=new C();
        c.execute1();
        c.execute2();
    }
}
