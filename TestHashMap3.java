package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(101,"Nirmal");
        hashMap.put(102,"Akash");
        hashMap.put(103,"Ankit");
        hashMap.put(104,"Aniket");
        System.out.println(hashMap);
        for(Map.Entry<Integer,String> set:hashMap.entrySet()){
            System.out.println(set.getKey()+"="+set.getValue());
        }
        System.out.println(hashMap.keySet());

    }
}
