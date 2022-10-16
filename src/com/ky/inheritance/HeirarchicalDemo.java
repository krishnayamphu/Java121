package com.ky.inheritance;

class Shape{
    void draw(String shape){
        System.out.println("drawing "+shape+" shape");
    }
}

class Circle extends Shape{

}
class Rectangle extends Shape{

}
public class HeirarchicalDemo {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw("circle");

        Rectangle rectangle=new Rectangle();
        rectangle.draw("rectangle");
    }
}
