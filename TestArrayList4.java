package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(5);
        list.add(23);
        list.add(34);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
