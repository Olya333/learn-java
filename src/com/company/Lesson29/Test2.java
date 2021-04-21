package com.company.Lesson29;

public class Test2 {

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
//            if (sc.testStudent(s)) {
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
//        findStudentsOverGrade fsog = new findStudentsOverGrade();
//        findStudentsUnderGrade fsug = new findStudentsUnderGrade();
//        findStudentsOverAge fsoa = new findStudentsOverAge();
//        findStudentsUnderAge fsua = new findStudentsUnderAge();
//        findStudentsBySex fsbs = new findStudentsBySex();
//        findStudentsMixCondition fsmc = new findStudentsMixCondition();
//
//        si.testStudent(list,fsog);
//        System.out.println("______________________________________________");
//        si.testStudent(list,fsug);
//        System.out.println("______________________________________________");
//        si.testStudent(list,fsoa);
//        System.out.println("______________________________________________");
//        si.testStudent(list,fsua);
//        System.out.println("______________________________________________");
//        si.testStudent(list,fsbs);
//        System.out.println("______________________________________________");
//        si.testStudent(list,fsmc);
//        System.out.println("______________________________________________");
//
//
//    }
//}
//
//interface StudentChecks {
//    boolean testStudent(Student1 s);
//}
//
//class findStudentsOverGrade implements StudentChecks {
//    public boolean testStudent(Student1 s) {
//        return s.avgGrade > 8.5;
//    }
//}
//
//class findStudentsUnderGrade implements StudentChecks {
//    public boolean testStudent(Student1 s) {
//        return s.avgGrade > 9;
//    }
//}
//class findStudentsOverAge implements StudentChecks {
//    public boolean testStudent(Student1 s) {
//        return s.age > 25;
//    }
//}
//class findStudentsUnderAge implements StudentChecks {
//    public boolean testStudent(Student1 s) {
//        return s.age < 27;
//    }
//}
//class findStudentsBySex implements StudentChecks {
//    public boolean testStudent(Student1 s) {
//        return s.sex == 'm';
//    }
//}
//class findStudentsMixCondition implements StudentChecks {
//    public boolean testStudent(Student1 s) {
//        return (s.avgGrade >7.2 && s.sex=='f' && s.age<23);
//    }
//}

