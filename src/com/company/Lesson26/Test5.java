package com.company.Lesson26;

public class Test5 {
    {
        System.out.println("Eto init blok3");
    }
    Test5() {
        System.out.println("Eto konstruktor1");
    }

    Test5(int a) {
        this();
        System.out.println("Eto konstruktor2");
    }


   static  {
        System.out.println("Eto STATIC init blok1");
    }
    {
        System.out.println("Eto init blok1");
    }
    {
        System.out.println("Eto init blok2");
    }
    static  {
        System.out.println("Eto STATIC init blok2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);
    }
}
