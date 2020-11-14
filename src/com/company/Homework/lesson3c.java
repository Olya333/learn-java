package com.company.Homework;

public class lesson3c {
    public static void main(String [] args){

        int a1 = 10;
        int b1 = 5;
        boolean c1 = !(a1>b1);

        System.out.println(c1);
        System.out.println("______________________________________");

        int a2 =10;
        int b2 = 50;
        int c2 = 0;
        int d2 = 100;

        boolean e = a2<b2 && c2++==d2;//true && false= false

        System.out.println(e);
        System.out.println(c2);
        System.out.println("________________________________________");


        int x = 10;
        int y = 5;

        System.out.println(x|y);

        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = false;

        System.out.println(b3^b4^b5^b6);




    }

}
