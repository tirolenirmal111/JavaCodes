//passing array to method
package com.array;

import java.sql.SQLOutput;

public class TestArray4 {
    static void min(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

                System.out.println(min);

    }
    public static void main(String[] args) {
        int a[]={33,22,4,5,2,55,11,99};
        min(a);//passing array
    }
}
