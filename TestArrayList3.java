package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list);
        list.add(5,78);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.contains(15));
    }
}
