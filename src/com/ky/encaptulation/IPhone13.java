package com.ky.encaptulation;

public class IPhone13 {
    private String brand;
    private String model;
    private String color;

    public void getInfo(){
        this.brand="Apple";
        this.model="Iphone13 MaxPro";
        this.color="Silver Black";

        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
    }
}
