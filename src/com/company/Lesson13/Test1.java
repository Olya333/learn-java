package com.company.Lesson13;

public class Test1 {

}

class Student{
    double grade;
    Student(double grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        if(st1.grade == 2){
            System.out.println("Student dvoichnik");
        }
        else if(st1.grade ==3){
            System.out.println("Student troishnik");
        }
        else if(st1.grade ==4){
            System.out.println("Student horoshist");
        }
        else if(st1.grade ==5){
            System.out.println("Student otlichnik");
        }
        else{
            System.out.println("ocenka ne verna");
        }
    }

}
