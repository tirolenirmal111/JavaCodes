//Creating Anonymous array
package com.array;

public class TestArray5 {
    static void printArray(int arry[])
    {
        for(int i=0;i< arry.length;i++)
            System.out.println(arry[i]);
    }

    public static void main(String[] args) {
        printArray(new int[]{10,20,30,40,50});
    }
}
