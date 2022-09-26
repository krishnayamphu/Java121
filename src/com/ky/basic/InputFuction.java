package com.ky.basic;

import java.util.Scanner;

public class InputFuction
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you name");
        String name=sc.nextLine();
        System.out.println("Your name is: "+name);

        int x, y;
        System.out.println("Enter value of x and y:");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Toltal sum: "+(x+y));
    }
}
