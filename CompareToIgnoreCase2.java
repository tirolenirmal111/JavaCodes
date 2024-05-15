package com.stringMethods;

public class CompareToIgnoreCase2 {
    public static void main(String argvs[])
    {
        String string1 = "6";//unincode 54
        String string2 = "Book";// b ki 66

        System.out.println(string1.compareToIgnoreCase(string2));
        //we are getting -44. It is because the string "Book" is getting converted into "book",
        // and the Unicode value of 'b' is 98. Thus, 54 - 98 is -44
    }
}
