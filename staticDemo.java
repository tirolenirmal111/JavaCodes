package com.staticBlock;

public class staticDemo {
    public static void main(String[] args) {
        // calling static method
        // without instantiating Student class
        Student.setCllgName("ips");

        Student s1 = new Student("Nirmal");
        Student s2 = new Student("Raja");

        s1.getStudentInfo();
        s2.getStudentInfo();

    }
}
