package com.company.Lesson25;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        //System.out.println(7);
        int i1 = 3;
        short s2 = (short)i1;
        byte b2 = 3;
        short s1 = -6;
        char c1 = 100;
        long l1 = 1;
        int i2 = (int)l1;

        int i10 = 111111;
        short s10 = (short)i10;
        //System.out.println(s10); teryaem informacyu

        char c10 = (char)-8;
        System.out.println(c10);
        int i12 = (int)3.14;
        System.out.println(i12);

        int i =5;
        long l = 10;
        i*=l;
        System.out.println(i+l);

        float f = 3.14f;
        int i3 = 10;
        System.out.println(f+i3);

        byte b3 =3;
        short s = 4;
        char c = 5;
        System.out.println(b3+s+c);
        System.out.println(b3++);

        byte b4 = 10;
        float f2 = 7;
        double d2 = 2.0;
        double d5 = b4+f2-d2;
        System.out.println(b4+f2-d2);

        double d10 = 3.14;
        float f10 = 6.28f;

        float f11 = 0*1.5f;
        float f12 = 0* (float)1.5;



    }
}
