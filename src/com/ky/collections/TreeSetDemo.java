package com.ky.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> books=new TreeSet<>();
        books.add("ABC Book");
        books.add("Java Programming");
        books.add("C programming");

        Iterator itr=books.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
