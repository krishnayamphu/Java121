package com.ky.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> students=new HashSet<>();
        students.add("Ram");
        students.add("Hari");
        students.add("Mohan");
//        students.add("Ram"); duplicate data

        for(String s:  students){
            System.out.println(s);
        }
    }
}
