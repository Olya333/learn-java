package com.company.Homework;

public class lesson3HW {
    public static void main(String[]argc){
        int i1 = 5;
        int i2 = 11;

        double d1 = 5.5;
        double d2 = 1.3;

        long l = 20l;
        double d= 20l;


        double result = 0;
        result = i2 / d1 + d2%i1 -l;


        System.out.println(result);
        System.out.println("___________________________________");

        int a = 5;
        System.out.println(a-- - --a+ ++a +a++ +a);

        int b = 8;
        System.out.println(++b - b++ + ++b - --b);

        int c = 6;
        System.out.println(++c- --c +c---c+++c+c);

    }
}
