package com.LinkedList;

import java.util.LinkedList;

public class TestLinkedList2 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("a");
        linkedList.add(10);
        linkedList.add(10.6);
        linkedList.add("Nirmal");
        linkedList.add("Tirole");
        System.out.println("data="+linkedList);
        System.out.println(linkedList.size());

        linkedList.remove(10.6);
        linkedList.remove(0);
        System.out.println("after deleting"+linkedList);
        System.out.println(linkedList.size());
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("final list"+linkedList);
        int a=(Integer)linkedList.get(0);
        System.out.println("ll after change:"+linkedList);

    }
}
