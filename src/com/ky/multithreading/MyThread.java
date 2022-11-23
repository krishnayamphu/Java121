package com.ky.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Thread is running");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }
}
