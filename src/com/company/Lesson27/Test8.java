package com.company.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
            return a;
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            System.out.println("Peremennaya v catch bloke = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Eto block finally");
            System.out.println("Peremennaya v finally bloke = " + a);

        }

    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
