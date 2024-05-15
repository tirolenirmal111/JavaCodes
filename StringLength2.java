package com.stringMethods;

public class StringLength2 {
    public static void main(String[] args) {
        String str="javatpoint";
        if(str.length()>0)
        {
            System.out.println("String is not empty "+str.length());
        }
        str="";
        if(str.length()==0)
        {
            System.out.println("String is empty now: "+str.length());
        }

    }
}
