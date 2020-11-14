package com.company.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double yvelichenieZarplati() {
        salary *= 2;
        return salary;
    }
}


class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Sidorov", 30, 550.6, "IT");
        Employee emp2 = new Employee(2, "Ivanov", 25, 740.1, "IT");

        emp1.yvelichenieZarplati();
        System.out.println("Novaya zarplata rabotnika : " + emp1.surname + " " + emp1.salary);

        emp2.yvelichenieZarplati();
        System.out.println("Novaya zarplata rabotnika : " + emp2.surname + " " + emp2.salary);

    }
}
