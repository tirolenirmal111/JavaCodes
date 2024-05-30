package com.vector;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector vector=new Vector();
        System.out.println(vector.capacity());
        System.out.println(vector.isEmpty());
        vector.add("Nirmal");
        vector.add("Akash");
        vector.add("Ankit");
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
    }
}
