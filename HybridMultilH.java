package com.hybridInheritance;

public class HybridMultilH {
    public static void main(String[] args)
    {
     Son s=new Son();
     s.showG();s.showF();s.showS();
     Daughter d=new Daughter();
     d.showG();d.showF();d.showD();
    }
}
class Grandfather
{
    public void showG()
    {
        System.out.println("he is grand father");
    }
}
class Father extends Grandfather
{
    public void showF()
    {
        System.out.println("he is father");
    }
}
class Son extends Father
{
    public void showS()
    {
        System.out.println("he is son");
    }
}
class Daughter extends Father
{
    public void showD()
    {
        System.out.println("she is daughter");
    }
}