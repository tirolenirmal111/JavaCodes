package com.hashmap;

import java.util.HashMap;
import java.util.List;

public class TestHashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,HashMap<Long,HashMap<String,String>>> hm1= new HashMap<>();
        Integer key1=1;
        Long key2=100l;
        String key3="Nirmal";

        String value="Tirole";

        if (!hm1.containsKey(key1)){
            hm1.put(key1,new HashMap<>());
        }

        HashMap<Long, HashMap<String, String>> level1Map = hm1.get(key1);
        if (!level1Map.containsKey(key2)){
            level1Map.put(key2,new HashMap<>());
        }
        HashMap<String,String> level2Map= level1Map.get(key2);
        level2Map.put(key3,value);
        System.out.println(hm1);
    }
}





