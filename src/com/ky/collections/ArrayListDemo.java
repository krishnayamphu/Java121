package com.ky.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();

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
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Ram",20));
        students.add(new Student("Hari",19));
        for(Student s:students){
            System.out.println(s.getName()+" "+s.getAge());
        }


    }
}
