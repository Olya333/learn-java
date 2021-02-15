package com.company.Lesson24;

public class Test4 {
Jampabal j1 = new Human();
Jampabal j2 = new Animal();
}
class Human implements Jampabal{public void jamp(){
    System.out.println("human jamps");
}}
class Animal implements Jampabal{public void jamp(){
    System.out.println("animal jamps");}}

interface Jampabal{
    void jamp();
}
interface A2{void abc();}
interface B2 extends A2,Jampabal{void def();}

abstract class D implements B2{}