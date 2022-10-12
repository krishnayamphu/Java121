package com.ky.oop;

class Bank{
    public Bank(){
        System.out.println("Bank is created");
    }
    public Bank(String bankname){
        this();
        getBankInfo(this);

        System.out.println("Bank Name: "+bankname);
    }
    int rate;
    void test(){
        System.out.println("hi");
    }

    void getRate(int rate){
        this.test();
        this.rate=rate;
    }
    void bankInfo(){
        System.out.println("Bank Name: ABC Bank");
        System.out.println("Address: Kumaripati, Lalitpur");
    }
    void getBankInfo(Bank bank){
        bank.bankInfo();
    }
    public Bank getBankObject(){
        return this;
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        Bank bank=new Bank("NMB");
        bank.getRate(10);
        System.out.println("Bank Interest Rate: "+bank.rate);

        System.out.println("===================================");
        Bank b=new Bank().getBankObject();

        b.test();
    }
}
