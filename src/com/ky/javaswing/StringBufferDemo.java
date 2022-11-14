package com.ky.javaswing;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Aptech");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Computer");

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sbr=new StringBuffer("Hello");
        sbr.insert(5,"world");
        System.out.println(sbr);

        sbr.replace(0,5,"hi");
        System.out.println(sbr);

        System.out.println(sbr.delete(0,2));

        System.out.println(sbr.delete(0,2));
        System.out.println(sbr.deleteCharAt(0));

        StringBuffer stringBuffer=new StringBuffer("aptech.com");
        System.out.println(stringBuffer.indexOf("."));
        System.out.println(stringBuffer.indexOf("c"));
        System.out.println(stringBuffer.lastIndexOf("c"));
    }
}
