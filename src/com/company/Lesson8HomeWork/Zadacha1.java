package com.company.Lesson8HomeWork;

public class Zadacha1 {
    static int umnojenie(int a, int b, int c) {
        return a * b * c;

    }

    static void delenie(int a, int b) {
        System.out.println("Rezyltat deleniya = " + a / b + ","+" Ostatok ot deleniya= " + a % b);
    }


}

class Zadacha1Test{
    public static void main(String[] args) {
        System.out.println(Zadacha1.umnojenie(25,4,2));
        Zadacha1.delenie(25,4);
        System.out.println(Zadacha1.umnojenie(13,5,8));
        Zadacha1.delenie(13,5);
    }
}
