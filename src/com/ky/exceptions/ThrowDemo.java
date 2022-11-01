package com.ky.exceptions;

public class ThrowDemo {
    void voterAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You can vote");
        }else{
            throw new ArithmeticException("Invalid age value");
        }
    }
    public static void main(String[] args) {
        ThrowDemo th=new ThrowDemo();
        try{
            th.voterAge(10);
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("You are not eligible to vote");
        }
    }
}
