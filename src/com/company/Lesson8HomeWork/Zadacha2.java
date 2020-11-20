package com.company.Lesson8HomeWork;

public class Zadacha2 {
    public final static double PI = 3.14;

    public double ploshad(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }
    public static double dlinna(double radius2){
        double dl = 2* PI * radius2;
        return dl;
    }
    public void info(double radius3){
        System.out.println("Радиус = "+radius3);
        System.out.println("Площадь круга = " +ploshad(radius3));
        System.out.println("Длина окружности = " + dlinna(radius3));
    }
}

class Zadacha2Test{
    public static void main(String[] args) {
        Zadacha2 zd = new Zadacha2();
        zd.ploshad(5);
        Zadacha2.dlinna(7.5);
        zd.info(3);
    }
}

