package com.stringMethods;

public class StringConcat2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 = "Nirmal ";
        String str2 = "Rajaram ";
        String str3 = "Tirole";

        String str4 = str1.concat(str2);
        System.out.println(str4);

        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
    }

}
