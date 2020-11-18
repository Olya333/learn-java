package com.company.Lesson7Homework;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee("Ivanov");
      //  Employee emp3 = new Employee(550.6);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
       // System.out.println(emp2.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();


    }





}
