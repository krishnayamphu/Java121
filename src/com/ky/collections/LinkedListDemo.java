package com.ky.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> colors=new LinkedList<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Iterator itr=colors.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("===================");
        colors.remove("blue");
        colors.add("orange");
        for(String color: colors){
            System.out.println(color);
        }

        System.out.println("==============");
        LinkedList<Student> students=new LinkedList<>();
        students.add(new Student("Ram",20));
        students.add(new Student("Hari",19));
        for(Student s:students){
            System.out.println(s.getName()+" "+s.getAge());
        }


    }
}
