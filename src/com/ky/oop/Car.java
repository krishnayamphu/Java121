package com.ky.oop;

public class Car {
    public Car(){  //constructor
        System.out.println("default constructor");
    }

    public Car(String carname){
        System.out.println("Car name: "+carname);
    }

    public void test(){ //method
        System.out.println("test method");
    }

    public static void main(String[] args) {
        Car car=new Car();
        new Car("Toyota");
        //car.test();
    }
}
