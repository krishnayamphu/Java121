package com.ky.abstraction;

public interface Vehicle {
    void run();
    default void test(){
        System.out.println("testing vehicle");
    }
    static void service(){
        System.out.println("servicing vehicle");
    }
}
