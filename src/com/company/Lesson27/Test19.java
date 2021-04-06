package com.company.Lesson27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        // Animal2 a = new Mouse();
        //  try {
        // a.run();
        //  } catch (IOException e) {
        //      System.out.println("Exception poiman");
        // }
    }
}


class Animal2 {
    Animal2() throws FileNotFoundException {

    }
    // void run() throws IOException {
    //     System.out.println("Animal runs");
    // }
    //  void run(int a) throws Exception {
    //      System.out.println("Animal runs");
    // }
}

class Mouse extends Animal2 {
    Mouse() throws IOException {
        super();
    }
    // void run() throws NullPointerException,ArrayIndexOutOfBoundsException {
    //     System.out.println(" Mouse runs");
    // }
}

class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("nekorrektniy vozrast");
        }
        this.name = name;
        this.age = age;

    }
}
