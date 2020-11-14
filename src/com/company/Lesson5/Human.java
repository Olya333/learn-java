package com.company.Lesson5;

public class Human {
     String name;
     Car3 car;
     BankAccount bA;

    void info() {
        System.out.println("Imya:" + name + " cvet mashini:" + car.color
                + "  balans bankovskogo scheta: " + bA.balanse);
    }

    static class HumanTest {
        public static void main(String[] args) {
            Human h = new Human();

            h.name = "David";
            h.car = new Car3(" red", "V8");
            h.bA = new BankAccount(10,  200.5);
            h.info();

        }




    }

}


class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}


class BankAccount {
    BankAccount(int id2, double balanse2) {
        id = id2;
        balanse = balanse2;
    }

    int id;
    double balanse;
}