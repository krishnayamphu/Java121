package com.ky.stringhandling;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String name="Aptech";
        String cname=new String("Aptech Computer Education");
        String data="           Hello Aptech          ";

        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(cname.substring(0,15));
        System.out.println(name.equals("Aptech"));
        System.out.println(name.equalsIgnoreCase("aptech"));
        System.out.println(name.concat("Lalitpur"));
        System.out.println(name.replace('A','U'));
        System.out.println(name.indexOf('h'));
        System.out.println(name.toUpperCase());
        System.out.println(data.trim());

        String s=String.valueOf(100.5);

        System.out.println(s);
    }
}
