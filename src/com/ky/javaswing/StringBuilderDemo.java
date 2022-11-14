package com.ky.javaswing;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("welcome");
        System.out.println(sb);
        System.out.println(sb.replace(3,7,"done"));
    }
}
