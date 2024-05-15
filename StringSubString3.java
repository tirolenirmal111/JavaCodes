package com.stringMethods;

public class StringSubString3 {
    public static void main(String[] args) {
String str[]={"Nirmal Tirole","Rajaram Tirole","Sourabh Patel","Sohan gour","Kartik Sinda"};
        String surName="Tirole";
        int surNameSize=surName.length();
        int size=str.length;
        for(int j=0;j<size;j++)
        {
            int length= str[j].length();
            String subStr=str[j].substring(length-surNameSize);

            if(subStr.equals(surName))
            {
                System.out.println(str[j]);
            }
        }
    }
}
