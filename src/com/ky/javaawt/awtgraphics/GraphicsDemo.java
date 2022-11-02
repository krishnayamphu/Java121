package com.ky.javaawt.awtgraphics;

import java.awt.*;

public class GraphicsDemo  extends Frame {
    public GraphicsDemo(){
        setSize(400,300);
        setVisible(true);
        setTitle("Graphics Demo");
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
