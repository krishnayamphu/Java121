package com.ky.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {

            System.out.println("test 1");
            System.out.println("Result: " + (20 / 0));

        }catch (ArithmeticException e){
            System.err.println(e);
        }finally {
            System.out.println("test 2");
            System.out.println("you've reached finally block.");
        }
    }
}
