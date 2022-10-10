package com.ky.oop;

public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Ram";
        p.age=20;

        Person p2=new Person();
        p2.name="Sita";
        p2.age=19;

        System.out.println("Name: "+p.name);
        System.out.println("Age: "+p.age);

        System.out.println("----------------------------");
        System.out.println("Name: "+p2.name);
        System.out.println("Age: "+p2.age);
    }
}
