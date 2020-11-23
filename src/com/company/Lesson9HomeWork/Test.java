package com.company.Lesson9HomeWork;

public class Test {
    int a = 1;
    static int b = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.abc(3);

    }
}
