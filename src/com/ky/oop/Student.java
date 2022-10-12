package com.ky.oop;

public class Student {
    String name;
    static String schoolname="Aptech";

    public static void getSchoolName(){
        System.out.println("School's name: "+schoolname);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ram";

        System.out.println("Student's name: "+s1.name);
        System.out.println("School's name: "+Student.schoolname);
    }
}
