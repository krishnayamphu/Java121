package com.ky.javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo extends Frame {
    MenuBar mb;
    Menu mfile,medit,mhelp;
    MenuItem minew,miopen,misave,micopy,mipaste,miabout;
    public MenuBarDemo(){
        mb=new MenuBar();
        mfile=new Menu("File");
        minew=new MenuItem("New");
        miopen=new MenuItem("Open");
        misave=new MenuItem("Save");
        minew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Creating new Document");
            }
        });
        mfile.add(minew);
        mfile.add(miopen);
        mfile.add(misave);
        medit=new Menu("Edit");
        micopy=new MenuItem("Copy");
        mipaste=new MenuItem("Paste");
        medit.add(micopy);
        medit.add(mipaste);
        mhelp=new Menu("Help");
        miabout=new MenuItem("About");
        mhelp.add(miabout);

        mb.add(mfile);
        mb.add(medit);
        mb.add(mhelp);

        setMenuBar(mb);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
