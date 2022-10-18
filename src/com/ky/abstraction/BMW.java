package com.ky.abstraction;

public class BMW implements Vehicle{


    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.run();

        Vehicle v=new BMW();
        v.test();

        Vehicle.service();
    }

    @Override
    public void run() {
        System.out.println("BMW Car running safely.");
    }

}
