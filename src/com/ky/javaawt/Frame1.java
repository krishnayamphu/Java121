package com.ky.javaawt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
Font(String fontname, Font.Style, int size);
Color(r,g,b)
Color(Color.colorname)
 */
public class Frame1 extends Frame {
    Label lbltext;
    public Frame1(){
        Color c=new Color(255, 0, 0);
        Font font=new Font("Arial",Font.ITALIC,24);
        lbltext=new Label("Welcome to Java AWT UI");
        lbltext.setFont(font);
        lbltext.setForeground(c);
        lbltext.setBackground(Color.black);
        add(lbltext);
        setLayout(new FlowLayout());
        setSize(400,300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Frame1();
    }
}
