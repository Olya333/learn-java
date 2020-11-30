package com.company.Lesson12;

import com.company.Lesson9HomeWork.Test;

public class Test10 {
    int a = 5;
    void maximum(int i1,int i2,int i3){
        if(i1>i2 && i1>i3){
            int a = 10;
            System.out.println("Maximum - " + i1);
        }
        else if(i2>i1 && i2>i3){
            int a = 15;
            System.out.println("Maximum - " + i2);
        }
        else{
            System.out.println("Maximum - " + i3);
        }
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        t.maximum(4,7,0);

    }
}