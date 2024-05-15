//printing reverse of string
package com.stringMethods;

public class StringLength3 {
    public static void main(String[] args) {
        String str="Welcome to javat point";
        int size=str.length();
        System.out.println("Reverse of String: "+""+str+""+"is");
        for(int i=0;i<size;i++)
        {
            System.out.print(str.charAt(str.length()-i-1));
        }
    }
}
