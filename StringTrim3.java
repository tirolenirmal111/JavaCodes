package com.stringMethods;

public class StringTrim3 {
    public static void main(String[] args) {
        String str = " nirmal ";
        if((str.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else
        {
            System.out.println("The string contains only white spaces \n");
        }
        str = "    ";

        if((str.trim()).length() > 0)
        {
            System.out.println("The string contains characters other than white spaces \n");
        }
        else
        {
            System.out.println("The string contains only white spaces \n");
        }

    }
}
