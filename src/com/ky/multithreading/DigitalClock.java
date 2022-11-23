package com.ky.multithreading;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class DigitalClock extends JFrame implements Runnable {
    private JTextField txtbox;
    public DigitalClock(){
        init();
    }
    public void init(){
        txtbox=new JTextField();
        txtbox.setFont(new Font("arial",Font.BOLD,28));
        txtbox.setPreferredSize(new Dimension(200,40));
        txtbox.setHorizontalAlignment(0);
        txtbox.setEditable(false);
        add(txtbox);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }
    public void showTime(){
        LocalTime time=LocalTime.now();
        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        String data=h+" : "+m+" : "+s;
        txtbox.setText(data);
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new DigitalClock());
        thread.start();
    }
    @Override
    public void run() {
        while(true){
            showTime();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
