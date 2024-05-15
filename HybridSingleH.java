package com.hybridInheritance;

public class HybridSingleH {
    public static void main(String[] args) {
        BB d=new DD();
        //d.display();


    }
}
class AA{
    public void displayA()
    {
        System.out.println("A");
    }
}
class BB extends AA{
    public void displayB()
    {
        System.out.println("B");
    }
}
class CC extends AA{
    public void displayC()
    {
        System.out.println("C");
    }
}
class DD extends BB{
    public void displayD()
    {
        System.out.println("D");
    }
}