package com.ky.abstraction;

public abstract class Shape {
    Shape(){
        System.out.println("Shape is drawing");
    }

    //abstract method
    abstract void fill(String color);

    //non abstract method
    void draw(){
        System.out.println("Drawing shape");
    }
}
