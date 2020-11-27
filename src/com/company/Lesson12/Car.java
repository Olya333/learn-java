package com.company.Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine) {
            if (c2.doorCount > c2.doorCount) {
                System.out.println("Moshnost motora i kolichestvo dverei u pervoi mashini bolshe");
            } else {
                System.out.println("Moshnost motora u pervoi mashini bolshe,a kolichestvo dverei menshe");
            }
        } else
            System.out.println("Moshnost motora u pervoi mashini menshe");
    }

}


