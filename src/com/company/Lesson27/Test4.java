package com.company.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    void abc() throws FileNotFoundException {
        File f = new File("test5.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Vsem horoshego dnya!");
    }

    void dif() throws FileNotFoundException {
        System.out.println("privet");
        abc();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Test4 t = new Test4();
        try {
            t.dif();
        } catch (FileNotFoundException e) {
            FileNotFoundException f = e;
            System.out.println("Bil poiman exception  " + e);
            e.printStackTrace();
        }


    }
}
