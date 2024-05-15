package com.encapsulation;

public class TestEncapsulation2 {
    public static void main(String[] args) {
        Details d=new Details();
        d.setName("Nirmal");
        d.setAge(22);
        d.setMobno(07311234);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getMobno());

    }
}
class Details{
    private String name;
    private int age;
    private long mobno;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public long getMobno() {
        return mobno;
    }

    public void setMobno(long mobno) {
        this.mobno = mobno;
    }
}