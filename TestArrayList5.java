package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList5 {
    public static void main(String[] args) {
        List<Float> list=new ArrayList<Float>();
        list.add(2.0f);
        list.add(45.0f);
        list.add(89.0f);
        list.add(54.5f);
        System.out.println(list);
        System.out.println(list.remove(89.0f));
        System.out.println(list);
        System.out.println(list.hashCode());
        System.out.println(list.containsAll(list));
        System.out.println(list.listIterator(2));


    }
}
