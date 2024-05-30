package com.LinkedList;

import java.util.LinkedList;

public class TestLinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Nirmal");
        list.add("Nil");
        list.add("Akash");
        list.add("Sourabh");
        list.add("Rajaram");
        System.out.println(list);
       // System.out.println(list.listIterator(2));
        System.out.println(list.remove());
        System.out.println(list.remove(list));
        System.out.println(list.getLast());
        System.out.println(list.offerFirst("Nirveg"));
        System.out.println(list.offerLast("Vartik"));
        System.out.println(list);
        System.out.println(list.peek());
    }
}
