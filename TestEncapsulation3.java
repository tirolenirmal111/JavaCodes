package com.encapsulation;

public class TestEncapsulation3 {
    public static void main(String[] args)
    {
        Account ac=new Account();
        ac.setName("Nirmal");
        ac.setAccno(329296784);
        ac.setEmail("tirolenirmal111@gmail.com");
        ac.setAmount(100000);
        System.out.println(ac.getName());
        System.out.println(ac.getEmail());
        System.out.println(ac.getAccno());
        System.out.println(ac.getAmount());
    }
}
class Account
{
    private long accno;

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private String name,email;
    private int amount;

}