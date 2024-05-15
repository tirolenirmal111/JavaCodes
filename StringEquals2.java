package com.stringMethods;

public class StringEquals2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = "nirmal tirole";
        String s2 = "nirmal tirole";
        String s3 = "Nirmal Tirole";
        System.out.println(s1.equals(s2)); // True because content is same
        if (s1.equals(s3)) {
            System.out.println("both strings are equal");
        }else System.out.println("both strings are unequal");
    }


}
