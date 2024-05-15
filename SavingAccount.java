package com.singleInheritance;

public class SavingAccount extends BankAccount{
    int minbal=2000;
    void display(){
        System.out.println(accno+","+bankbal+","+minbal);
    }
}
