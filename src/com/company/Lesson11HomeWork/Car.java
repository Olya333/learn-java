package com.company.Lesson11HomeWork;

import com.company.Lesson10HomeWork.p1.p2.p3.C;

public class Car {
    String color;
    String engine;
    int quantityOfDoors;


    public Car(String color, String engine, int quantityOfDoors) {
        this.color = color;
        this.engine = engine;
        this.quantityOfDoors = quantityOfDoors;
    }

}

class CarTest {
     void increaseQuantityOfDoors(Car c,int quantityOfDoors){
        c.quantityOfDoors = quantityOfDoors;

    }
    void increaseColor(Car c1,Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red","V6",2);
        Car car2 = new Car("black","V8",4);
        ct.increaseQuantityOfDoors(car1,3);
        ct.increaseColor(car1,car2);
        System.out.println("Информация о первой машине :  Цвет: "+ car1.color + "  мотор: "
        + car1.engine + "  Количество дверей: " + car1.quantityOfDoors);
        System.out.println("Информация о первой машине :  Цвет: "+car2.color + "  мотор: "
                + car2.engine + "   Количество дверей: " + car2.quantityOfDoors);
    }
}
