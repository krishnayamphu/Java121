package com.ky.javaawt;

import com.ky.inheritance.B;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Label lbltext=new Label("Some text");
        TextField txtbox=new TextField("enter text",20);
        Button btn=new Button("Click me");
        Frame f=new Frame();

        f.add(lbltext);
        f.add(txtbox);
        f.add(btn);

        f.setSize(400,300);
        f.setLayout(new FlowLayout());
        f.setTitle("Frame Demo");
        f.setLocation(200,100);
        f.setVisible(true);
    }
}
