package com.company.Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name,int course,double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student st1,Student st2){
        Student st3 = st1;
        st1 = st2;
        st2 = st3;
        System.out.println(st1.name);
    }

    public static void changeName(Student st1){
        st1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,9.5);
        Student st2 = new Student("Petr",1,5.3);
       changeName(st2);
        System.out.println(st2.name);
    }
}
