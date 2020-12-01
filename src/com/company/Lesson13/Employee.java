package com.company.Lesson13;

public class Employee {
    public static void main(String[] args) {
        int denNedeli = 3;
        final int a;
        final int b;




        switch (denNedeli*3) {
            case 1:

            case -2:

            case 3:

            case 4:

            case 5:
                System.out.println("Rabota do 18:00");
                break;
            case 6:
                System.out.println("Rabota do 14:00");
                break;
            case 7:
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne sushestvuet");
        }
    }
}
