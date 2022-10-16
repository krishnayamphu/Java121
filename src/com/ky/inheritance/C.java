package com.ky.inheritance;

public class C extends B {
    int c;

    public static void main(String[] args) {
        C oc=new C();
        oc.a=5;
        oc.b=10;
        oc.c=15;

        System.out.println("a,b and c: "+oc.a+","+oc.b+", "+oc.c);
    }
}
