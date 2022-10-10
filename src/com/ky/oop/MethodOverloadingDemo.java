package com.ky.oop;

public class MethodOverloadingDemo {
    void sum(){
        System.out.println("default sum method");
    }
    void sum(int x, int y){
        System.out.println("total sum: "+(x+y));
    }
    void sum(double x, double y){
        System.out.println("total: "+(x+y));
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj=new MethodOverloadingDemo();
        obj.sum(5.5,6.6);
    }
}
