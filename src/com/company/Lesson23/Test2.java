package com.company.Lesson23;

public class Test2 {
   // public Object abc(){
    //    return new Doctor();
   // }
    public static void main(String[] args) {
        //Doctor d = new Doctor();
      //  Teacher t = new Teacher();
     //   Driver dr = new Driver();
      //  Employee e = new Employee();
      //  Hirurg h = new Hirurg();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.age);
        System.out.println(emp1.name);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Doctor d2 = new Hirurg();
        System.out.println(d2.age);
        d2.eat();
        d2.sleep();
        d2.lechit();

        Employee emp4 = new Hirurg();
        emp4.eat();
        emp4.sleep();
        System.out.println(emp4.experience);
    }
}

class Employee {
    double salary = 100;
    String name ="Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {
    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}
class Hirurg extends Doctor {
    String skalpel;

    void operaciya() {
    }
}


class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}

