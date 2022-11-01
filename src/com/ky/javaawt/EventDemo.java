package com.ky.javaawt;

import com.ky.inheritance.B;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame implements ActionListener {
    private Button btn;
    public EventDemo(){
        btn=new Button("Click Me");
        add(btn);
        btn.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println( "hello world");
        }
    }
}
