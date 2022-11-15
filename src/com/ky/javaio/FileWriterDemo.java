package com.ky.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("data.txt");
            writer.write("Welcome to java io");
            writer.flush();
            writer.close();
            System.out.println("Data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
