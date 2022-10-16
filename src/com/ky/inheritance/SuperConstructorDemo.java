package com.ky.inheritance;
class Bank{
    public Bank(String bankname){
        System.out.println(bankname+" Bank is created");
    }
}
class NMB extends Bank{
    public NMB(String bankname){
        super(bankname);
    }
}
public class SuperConstructorDemo {
    public static void main(String[] args) {
        NMB nmb=new NMB("Mega");
    }
}
