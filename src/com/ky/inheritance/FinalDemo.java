package com.ky.inheritance;
class Abc{
    public final void hello(){
        System.out.println("Hello World");
    }
}
public class FinalDemo extends Abc {
    public final int maxSpeed=200;

    //public void hello(){};

    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();
        //obj.maxSpeed=300;
    }
}
