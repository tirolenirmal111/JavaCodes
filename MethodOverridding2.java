package com.polymorphism;

public class MethodOverridding2 {
    public static void main(String[] args) {
        SBI s=new SBI();
        System.out.println("Sbi rate="+s.getRateOfInterest());
        ICICI i=new ICICI();
        System.out.println("Icici rate="+i.getRateOfInterest());
        AXIS a=new AXIS();
        System.out.println("Axis rate="+a.getRateOfInterest());
    }
}
class Bank{
    int getRateOfInterest()
    {
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest()
    {
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest()
    {
        return 7;
    }
}
class AXIS extends Bank{
    int getRateOfInterest()
    {
        return 9;
    }
}
