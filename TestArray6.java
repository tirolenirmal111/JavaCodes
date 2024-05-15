package com.array;

public class TestArray6 {
    static int[]get(){
        return new int[]{10,50,100,90,20};
    }

    public static void main(String[] args) {
        int arr[]=get();
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
