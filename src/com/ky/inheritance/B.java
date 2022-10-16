package com.ky.inheritance;
class A{
    public int a;
}
public class B extends A{
    int b;

    public static void main(String[] args) {
        B obj=new B();
        obj.b=10;
        obj.a=5;

        System.out.println("value of a: "+obj.a);
        System.out.println("value of b: "+obj.b);
    }
}
