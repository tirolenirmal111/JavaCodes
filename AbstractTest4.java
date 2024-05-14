package com.abstractClass;

public class AbstractTest4 {
    public static void main(String[] args) {
        Bank4 b;
        b=new SBI4();
        System.out.println("Rate of Interest is:"+ b.getRateOfInterest());
        b=new PNB4();
        System.out.println("Rate of Interest is:"+b.getRateOfInterest());
    }
}
