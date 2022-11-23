package com.ky.multithreading;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Runnable thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Thread thread=new Thread(new RunnableThread());
        thread.start();
    }
}
