package com.company.Lesson16;

import com.company.Lesson10HomeWork.p1.p2.p3.p4.p5.E;

public class Test4 {

}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        System.out.println("On manadger?" + emp.isManager + " ego zarplata " + emp.salary);
    }
}
