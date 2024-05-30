package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList2 {
    public static void main(String[] args) {
        List<Object> list =new ArrayList<Object>();
        list.add(10);
        list.add(20.80);
        list.add(30);
        list.add("Ramesh");
        list.add(40);
        list.add(0.008);
        list.add(50);
        list.add(12345l);
        list.add(2.8f);

        for(Object o:list)
        {
            System.out.println(o);

        }

    }
}
