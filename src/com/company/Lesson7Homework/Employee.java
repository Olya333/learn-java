package com.company.Lesson7Homework;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;

    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("SURNAME = " + surname);
    }

    public void getSalary() {
        System.out.println("SALARY = " + salary);
    }


    public Employee(int id2) {

        id = id2;
    }

    public Employee(String surname2) {

        surname = surname2;
    }

    private Employee(double salary2) {

        salary = salary2;
    }

    double uvelichenieZarplati() {
        salary *= 2;
        return salary;

    }

}

