package com.ky.exceptions;

public class Exception2 {
    public static void main(String[] args) {
        try{
            int[] list=new int[2];
            list[0]=10;
            list[1]=20;
            System.out.println("test1");
            System.out.println(20/0);
            System.out.println("test2");
            System.out.println("List: "+list[0]);
        }catch (ArithmeticException e){
            System.err.println(e);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.err.println(e1);
        }
    }
}
