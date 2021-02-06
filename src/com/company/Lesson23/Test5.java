package com.company.Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
        t.sleep();
        Employee2 e = new Teacher2();
        System.out.println(t.salary);
    }

}

class Eda1 {
}

class Frukti1 extends Eda1 {
}

class Employee2 {
    String salary = "Dvesti";
    String name = "Kolya";

    public Eda1 eat() {
        System.out.println("Kushaet rabotnik");
        Eda1 e = new Eda1();
        return e;
    }

    static void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher2 extends Employee2 {
    double salary = 200;

    int kolichestvoUchenikov;

    @Override
    public Eda1 eat() {
        System.out.println("Kushaet uchitel");
        Frukti1 f = new Frukti1();
        return f;
    }

    void uchit() {
        System.out.println("Uchit");
    }

    static void sleep() {
        System.out.println("Spit uchitel");
    }
}


