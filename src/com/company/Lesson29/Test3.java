package com.company.Lesson29;

public class Test3 {

}
//class Student1 {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student1(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student1 st) {
//        System.out.println("imya studenta: " + st.name + ", " + "pol: " + st.sex + ", vozrast: " + st.age +
//                ", kurs: " + st.course + ", crednyaya ocenka: " + st.avgGrade);
//    }
//
//    void testStudent(ArrayList<Student1> aL, StudentChecks sc) {
//        for (Student1 s : aL) {
//            if (sc.test(s)) {
//                printStudent(s);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<Student1> list = new ArrayList<>();
//        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
//        Student1 st2 = new Student1("Nikolai", 'm', 28, 2, 6.4);
//        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
//        Student1 st4 = new Student1("Petr", 'm', 35, 4, 7);
//        Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo si = new StudentInfo();
//
//
//        si.testStudent(list,(Student1 st)->{return st.avgGrade>8.5;});
//        System.out.println("______________________________________________");
//        si.testStudent(list,st->st.avgGrade<9);
//        System.out.println("______________________________________________");
//        si.testStudent(list,(Student1 st)->{return st.age>25;});
//        System.out.println("______________________________________________");
//        si.testStudent(list,(Student1 st)->{return st.age < 27;});
//        System.out.println("______________________________________________");
//        si.testStudent(list,(Student1 st)->{return st.sex == 'm';});
//        System.out.println("______________________________________________");
//        si.testStudent(list,(Student1 st)->{return st.avgGrade>7.2 && st.age <23 && st.sex == 'f';});
//        System.out.println("______________________________________________");
//
//
//    }
//}
//
//interface StudentChecks {
//    boolean test(Student1 s);
//}
