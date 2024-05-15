// A java program to demonstrate use
// of static keyword with Classes
package com.staticBlock;

public class NestedStatic {
    private static String str="Java";
    static class MyNestedClass{
        public void display(){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        NestedStatic.MyNestedClass ns=new NestedStatic.MyNestedClass();
        ns.display();
    }
}
