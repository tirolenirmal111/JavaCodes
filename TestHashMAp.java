package com.hashmap;


import java.util.*;

public class TestHashMAp {
    public static void main(String[] args) {
        HashMap<Integer,List<String>> hashMap=new HashMap<>();
        hashMap.put(101,Arrays.asList("Ankit","Akash"));
        hashMap.put(102,Arrays.asList("Aniket","Aanand"));
        hashMap.put(103,Arrays.asList("Neha","Vansh"));
//        System.out.println(hm1);
        HashMap<Integer,HashMap<Integer,List<String>>> hashMap1=new HashMap<>();
       // hm2.put(101,hm1);
//        System.out.println(hm2);
        for(HashMap.Entry<Integer,List<String>> sets:hashMap.entrySet()){
            System.out.println(sets.getKey());
        }

    }
}
