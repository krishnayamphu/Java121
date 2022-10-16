package com.ky.inheritance;
class Animal{
    String color;
    void eat(){
        System.out.println("Eating food");
    }
}
class Dog extends Animal{
    String name;
    int legs;

    void info(String name){
        this.name=name;
        this.legs=4;
        super.color="brown";
        System.out.println("Dog's name: "+this.name);
        System.out.println("Dog's color:"+super.color);
        System.out.println("Dog's legs: "+this.legs);
        super.eat();
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.info("Puppy");

    }
}
