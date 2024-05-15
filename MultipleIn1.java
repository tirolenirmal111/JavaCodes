package com.multipleInheritance;
interface play{
    void plays();
    void dance();

}
class Boys implements play{
    public void plays(){
        System.out.println("boy is palying");
    }
    public void dance(){
        System.out.println("Boy is dancing");
    }
}
public class MultipleIn1 {
    public static void main(String[] args) {
        Boys b=new Boys();
        b.plays();
        b.dance();
    }
}
