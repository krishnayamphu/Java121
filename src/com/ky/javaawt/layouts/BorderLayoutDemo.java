package com.ky.javaawt.layouts;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    private BorderLayout bl;
    private Panel p1,p2,p3,p4,p5;
    public BorderLayoutDemo(){
        bl=new BorderLayout();
        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();
        p5=new Panel();
        p1.setBackground(Color.red);
        p1.add(new Button("Button"));
        p2.setBackground(Color.green);
        p3.setBackground(Color.blue);
        p4.setBackground(Color.CYAN);
        p5.setBackground(Color.orange);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        add(p3,BorderLayout.EAST);
        add(p4,BorderLayout.WEST);
        add(p5,BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
