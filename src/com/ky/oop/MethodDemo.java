package com.ky.oop;

public class MethodDemo {
    void test(){
        System.out.println("Testing something");
    }
    int getMaxSpeed(){
        return 200;
    }
    void sum(int x, int y){
        System.out.println("Total sum: "+(x+y));
    }

    double getDiscountAmount(double price, double disPercentage){
        double discount=(price*disPercentage)/100;
        return discount;
    }
    public static void main(String[] args) {
        MethodDemo obj=new MethodDemo();
        obj.test();

        System.out.println("Maximum car speed: "+obj.getMaxSpeed());

        obj.sum(10,5);
        obj.sum(100,50);

        System.out.println("Discount amount: "+obj.getDiscountAmount(1000,2.5));
    }
}
