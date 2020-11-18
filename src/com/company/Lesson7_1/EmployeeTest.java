package com.company.Lesson7_1;

public class EmployeeTest {
    public static void main(String[] args) {
        com.company.Lesson7Homework.Employee emp1 = new com.company.Lesson7Homework.Employee(1);
        com.company.Lesson7Homework.Employee emp2 = new com.company.Lesson7Homework.Employee("Ivanov");
        com.company.Lesson7.Employee emp3 = new com.company.Lesson7.Employee(550.6);

        //System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);


        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();


    }
}
