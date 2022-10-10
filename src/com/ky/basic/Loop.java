package com.ky.basic;

public class Loop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        int j=1;
        while(j<=5){
            System.out.println(j);
            j++;
        }

        int num[]={10,20,30,40,50};
        for(int n:num){
            System.out.println(n);
        }



    }
}
