package com.abstractClass;

class Employee1 extends AbstractTest1{
    @Override
    void printInfo() {
        String name="Sun";
        int age=20;
        float salary=222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}