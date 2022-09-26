package com.ky.basic;

public class IfDemo {
    public static void main(String[] args) {
        int age=45;

        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("n(You are uner age");
        }

        String username="user", password="u123";
        if(username.equals("user") && password.equals("u123")){
            System.out.println("Welcome");
        }else{
            System.out.println("Invalid username or password");
        }

    }
}
