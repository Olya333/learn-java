package com.company.Lesson9;

import java.util.concurrent.Callable;

public class Car {
    String color;
    String engine;
    static int count;


    public Car(String color, String engine) {

        this.count++;
        this.color = color;
        this.engine = engine;

    }

    public void sowColor() {
        System.out.println("Цвет машины " + color);
        changeColor("red");
    }

    public void changeColor(String color3) {
        System.out.println("Цвет машины изменился " + "color3");
        color = color3;
        int cena = 5000;
        cena += 1000;

    }
}
