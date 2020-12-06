package com.company.Lesson14HomeWork;

public class Test1 {
    public static void vremya() {
        OUTER: for (int chas = 0; chas <= 6; chas++) {
            MIDDLE: for (int minyta = 0; minyta <= 60; minyta++) {
            if(chas>1 && minyta % 10 ==0){break OUTER;}
               INNER: for (int sekynda = 0; sekynda <= 60; sekynda++) {
                if(sekynda*chas>minyta){continue INNER;}
                    System.out.println(chas+" : "+minyta +" : "+ sekynda);
                }
            }
        }
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.vremya();

    }
}