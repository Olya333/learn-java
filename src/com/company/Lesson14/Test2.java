package com.company.Lesson14;

public class Test2 {
    public static void main(String[] args) {

        for ( int i = 5, j=10;i < 11 && i> -3 || i>4 ; i++,j=j+20 ,abc(10)) {
            System.out.println(i+j);
        }
    }
    static void abc(int n){
        System.out.println(n);
    }
}