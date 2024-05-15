package com.stringMethods;

public class StringCharAt3 {
    public static void main(String[] args) {
        String str="Welcome to evision";
        for(int i=0;i<str.length();i++){
            if(i%2==0)//printing characters presented at even positions
            {
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }
    }
}
