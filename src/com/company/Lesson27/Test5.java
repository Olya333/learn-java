package com.company.Lesson27;

public class Test5 {
    static void  abc(){
        System.out.println("rabotaet metod abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
