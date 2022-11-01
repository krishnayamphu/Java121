package com.ky.javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo3 extends Frame {
    private TextField txtbox;
    private Button btnAdd, btnRemove;
    public EventDemo3(){
        txtbox=new TextField(30);
        btnAdd=new Button("Add Text");
        btnRemove=new Button("Remove Text");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("Hello World");
            }
        });

        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("");
            }
        });

        add(txtbox);
        add(btnAdd);
        add(btnRemove);

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);

    }

    public static void main(String[] args) {
        new EventDemo3();
    }
}
