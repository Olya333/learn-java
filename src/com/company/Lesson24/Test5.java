package com.company.Lesson24;

public class Test5 {

}

interface I1 {
    default void abc() {
        System.out.println("eto metod abc");
    }

    static void dif() {
        System.out.println("static metod 1");
    }
}

interface I2 {
    static void dif() {
        System.out.println("static metod 2");
    }
}

abstract class O {
}

class R extends O implements I1 {
    static I2 metod1(I2 i) {
        return new D2();
    }

    public static void main(String[] args) {
        I2 i = new D2();
        metod1(i);
    }
}

class D2 implements I2 {
}
//void abc();
// default void ghi(){
//      System.out.println("eto metod ghi");
//  }
//  default void def(){
//  System.out.println("eto metod def");


//class Z2 implements I1{
// public void abc() {
// System.out.println("eto metod abc"); }

//  public static void main(String[] args) {
//      Z2 z = new Z2();
//      z.abc();
//      z.def();
//