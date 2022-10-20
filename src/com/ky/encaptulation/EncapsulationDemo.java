package com.ky.encaptulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s=new Student();
        //s.name="Ram";
        s.setName("Ram");

        System.out.println("Student name: "+s.getName());

        IPhone13 phone13=new IPhone13();
        phone13.getInfo();
    }
}
