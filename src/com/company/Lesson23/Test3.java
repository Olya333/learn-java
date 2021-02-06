package com.company.Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Teacher1();
        e.eat();
        
    }
}
class Eda{}
class Frukti extends Eda{}

class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

   public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;

    public Frukti eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }


    void uchit() {
        System.out.println("Uchit");
    }
}
class A{
    Employee1 objectCreation(){
        return new Employee1();
    }
}

class B extends A{
    Teacher1 objectCreation(){
        System.out.println("ok");
        return new Teacher1();
    }

}
