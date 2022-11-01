package com.ky.javaawt;

import java.awt.*;

public class PanelDemo extends Panel {
    public PanelDemo(){
        setLayout(new FlowLayout());
        add(new Button("button"));
        add(new Button("button"));
        add(new Button("button"));
        add(new Button("button"));
        setSize(300,300);
        setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.add(new PanelDemo());
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
