package com.company.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;
public class Test6 {

}
    class Student1 {
        String name;
        char sex;
        int age;
        int course;
        double avgGrade;

        Student1(String name, char sex, int age, int course, double avgGrade) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }
    }

    class StudentInfo {
        void printStudent(Student1 st) {
            System.out.println("imya studenta: " + st.name + ", " + "pol: " + st.sex + ", vozrast: " + st.age +
                    ", kurs: " + st.course + ", crednyaya ocenka: " + st.avgGrade);
        }

        void testStudent(ArrayList<Student1> aL,Predicate<Student1> t) {
            for (com.company.Lesson29.Student1 s : aL) {
                if (t.test(s)) {
                    printStudent(s);
                }
            }
        }


        public static void main(String[] args) {
            ArrayList<Student1> list = new ArrayList<>();
            com.company.Lesson29.Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
            com.company.Lesson29.Student1 st2 = new Student1("Nikolai", 'm', 28, 2, 6.4);
            com.company.Lesson29.Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
            com.company.Lesson29.Student1 st4 = new Student1("Petr", 'm', 35, 4, 7);
            com.company.Lesson29.Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);
            StudentInfo si = new StudentInfo();
            for(Student1 s : list){
                System.out.println(s.name);}
            System.out.println("_____________");
            list.removeIf(x->x.name.endsWith("a"));
            for(Student1 s : list){
                System.out.println(s.name);}


//            si.testStudent(list,(Student1 st)->{return st.avgGrade>8.5;});
//            System.out.println("______________________________________________");
//            si.testStudent(list,st->st.avgGrade<9);
//            System.out.println("______________________________________________");
//            si.testStudent(list,(Student1 st)->{return st.age>25;});
//            System.out.println("______________________________________________");
//            si.testStudent(list,(Student1 st)->{return st.age < 27;});
//            System.out.println("______________________________________________");
//            si.testStudent(list,(Student1 st)->{return st.sex == 'm';});
//            System.out.println("______________________________________________");
//            si.testStudent(list,(Student1 st)->{return st.avgGrade>7.2 && st.age <23 && st.sex == 'f';});
//            System.out.println("______________________________________________");


        }
    }


