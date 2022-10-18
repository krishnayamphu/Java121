package com.ky.abstraction;
class Circle extends Shape{

    @Override
    void fill(String color) {
        System.out.println("circle color fill with "+color);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
        circle.fill("red");

        Shape circle1=new Circle();
        circle1.fill("green");
    }
}
