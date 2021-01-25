package com.company.Lesson21;

public class Test7 {
    public void abc(int a,int b){
        System.out.println("privet");
    }
    public void abc(double a,double b){
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1,2);
    }
}
