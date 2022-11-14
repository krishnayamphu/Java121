package com.ky.javaawt.awtgraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingApp extends Frame {
    Button btncircle;
    public DrawingApp(){

        btncircle=new Button("Circle");
        btncircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("drawing circle");
                Graphics g=getGraphics();
                //g.setColor(Color.red);
                //g.drawOval(100,100,100,100);
               // g.fillOval(250,100,100,100);
                int x[]={50,150,50,100,150};
                int y[]={100,100,200,50,200};
                g.drawPolygon(x,y,5);
            }
        });
        add(btncircle);
        setLayout(new FlowLayout());
        setSize(600,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawingApp();
    }
}
