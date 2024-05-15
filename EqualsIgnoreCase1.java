package com.stringMethods;

public class EqualsIgnoreCase1 {
    public static void main(String[] args) {
        String s1="nirmaltirole";
        String s2="nirmaltirole";
        String s3="NIRMALTIROLE";
        String s4="mohan";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
    }

}
