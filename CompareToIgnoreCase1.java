package com.stringMethods;

public class CompareToIgnoreCase1 {
    public static void main(String argvs[])
    {
        String string1 = "Book";
        String string2 = "book";
        String string3 = "look";
        String string4 = "abc";
        String string5 = "BEEN";

        System.out.println(string1.compareToIgnoreCase(string2));
        System.out.println(string1.compareToIgnoreCase(string3));
        System.out.println(string1.compareToIgnoreCase(string4));
        System.out.println(string1.compareToIgnoreCase(string5));

    }
}
