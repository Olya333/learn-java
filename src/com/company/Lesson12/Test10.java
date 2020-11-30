package com.company.Lesson12;

import com.company.Lesson9HomeWork.Test;

public class Test10 {

    void abc() {
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maximum = (a>b)?a:b;
        System.out.println(maximum);


    }
}