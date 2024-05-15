package com.encapsulation;
class TestEncapsulation
{
    //TestEncapsulation t=new TestEncapsulation();
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Nirmal");
        System.out.println(s.getName());
    }


}
public  class Student
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
