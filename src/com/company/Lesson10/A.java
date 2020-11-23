package com.company.Lesson10;

import com.company.Lesson9.*;

public class A {
    public static void main(String[] args) {

        java.lang.String st1 = new java.lang.String("hello");
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c);

    }

}

class B {
    Student st3 = new Student();
}