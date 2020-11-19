package com.company.Lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Hyman{
    String name = "Ivan";
    Car c = new Car();

    public static void main(String[] args) {
        Hyman h1 = new Hyman();
        h1.c  = new Car();
        h1.c = new Car();
        h1.c.engine = "V8";
    }


}
