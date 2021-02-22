package com.company.Lesson24;

public class Test {
}
interface L1{
   private static void method1(){
        System.out.println("static method");
    }
    private void method2(){
        System.out.println("non-static method");
    }
    default void method3(){
       method1();
    }
    static void method4(){
       method1();
    }
}