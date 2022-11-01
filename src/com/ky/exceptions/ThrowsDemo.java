package com.ky.exceptions;

import javax.swing.*;

public class ThrowsDemo {
    void test() throws ArrayIndexOutOfBoundsException{
        int n[]= {10,20};
        System.out.println(n[5]);
    }
    public static void main(String[] args) {
        ThrowsDemo ob=new ThrowsDemo();
        try{
            ob.test();
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
