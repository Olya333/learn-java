package com.company.lesson4;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    double AverageGradeInMath;
    double AverageFatingForTheEconomy;
    double AverageGradeInaForeignLanguage;


    Student(int studentId2, String name2, String surname2, int course2, double
            AverageGradeInMath2, double AverageFatingForTheEconomy2, double
                    AverageGradeInaForeignLanguage2) {

        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        AverageGradeInMath = AverageGradeInMath2;
        AverageFatingForTheEconomy = AverageFatingForTheEconomy2;
        AverageGradeInaForeignLanguage = AverageGradeInaForeignLanguage2;

    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, course3, 0, 0, 0);

    }

    Student() {

    }
}


class StudentTest {

    double sredArifmOcenka(Student st) {
        double sredOcenka = (st.AverageGradeInMath + st.AverageFatingForTheEconomy
                + st.AverageGradeInaForeignLanguage) / 3;
        System.out.println("Srednyaya Arifmeticheskaya Ocenka Studenta: " + st.name + " "
                + st.surname + " " + sredOcenka);
        return sredOcenka;
    }


    public static void main(String[] args) {

        Student st1 = new Student();

        st1.studentId = 1;
        st1.name = "Ilia";
        st1.surname = "Ivanov";
        st1.course = 2;
        st1.AverageGradeInMath = 6.9;
        st1.AverageFatingForTheEconomy = 8.8;
        st1.AverageGradeInaForeignLanguage = 9;


        Student st2 = new Student(2, "Anton", "Petrov", 1);

        st2.AverageGradeInMath = 8.1;
        st2.AverageFatingForTheEconomy = 6.1;
        st2.AverageGradeInaForeignLanguage = 5.5;


        Student st3 = new Student(3, "Peter", "Sidorov", 3, 8.1, 7.3, 4);

        StudentTest aTest = new StudentTest();

        aTest.sredArifmOcenka(st1);
        aTest.sredArifmOcenka(st2);
        aTest.sredArifmOcenka(st3);


    }

}