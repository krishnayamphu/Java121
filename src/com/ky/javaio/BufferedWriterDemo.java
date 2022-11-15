package com.ky.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("doc.txt"));
            bw.write("welcome to java programming");
            bw.flush();
            bw.close();
            System.out.println("data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
