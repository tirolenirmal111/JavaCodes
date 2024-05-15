package com.hierarchyInheritance;

public class Hierarchy3 {
    public static void main(String[] args)
    {
        Boy b=new Boy();
        b.displayGF();b.displayF();b.displayB();
        UBoy ub=new UBoy();
        ub.displayUB();ub.displayU();ub.displayGF();

    }
}
class GrandFather{
        public void displayGF()
        {
            System.out.println("grand  father");
        }
}
class Father extends GrandFather{
    public void displayF()
    {
        System.out.println("father");
    }
}
class Uncle extends GrandFather{
    public void displayU()
    {
        System.out.println("uncle");
    }
}
class Boy extends Father{
    public void displayB()
    {
        System.out.println("Boy");
    }
}
class Girl extends Father{
    public void displayG()
    {
        System.out.println("Girl");
    }
}
class UBoy extends Uncle{
    public void displayUB()
    {
        System.out.println("Uncle boy ");
    }
}
class UGirl extends Uncle{
    public void displayUG()
    {
        System.out.println(" Uncle Girl");
    }
}