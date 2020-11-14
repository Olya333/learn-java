package com.company.Lesson6;

public class MethodOverloading {

    void show (int i1){
        System.out.println(i1);
        System.out.println("Data Type is int");
    }

    void show(int a,int b){
        System.out.println(a);
        System.out.println("Data Type is int");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Data Type is String");

    }

    void show(String s,int a){
        System.out.println("String: " + s + "int: " +a);
    }


    void show(int a,String s){
        System.out.println("Kakoi horoshii den!");
    }


}


class MethodOverloadingTest{

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        int a = 500;
        mo.show(a);

        boolean b = true;
        mo.show(b);

        String s = "Privet!!!";
        mo.show(s);
        mo.show("privet",10);

    }
}