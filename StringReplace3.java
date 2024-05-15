package com.stringMethods;

public class StringReplace3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str="Rakesh is from mumbai";
        int size=str.length();
        System.out.println(str);
        String target =null;
        str=str.replace(target, "is from");//assigning null to (is from);
        System.out.println(str);
    }

}
