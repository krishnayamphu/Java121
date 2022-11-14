package com.ky.javaawt.awtgraphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsDemo  extends Frame {
    public GraphicsDemo(){
        setSize(400,300);
        setVisible(true);
        setTitle("Graphics Demo");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(30,50,100,100);
        g.setColor(Color.green);
        g.drawOval(150,50,100,100);
        g.fillArc(50,170,100,100,0,90);
    }
    public static void main(String[] args) {
        new GraphicsDemo();
    }


}
