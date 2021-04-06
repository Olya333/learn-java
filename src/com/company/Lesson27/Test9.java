package com.company.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("Eto block finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i polnostiy obrabotan");
        }
    }

    //  void def() {
    //       try {
    //           int [] array = {1,2,3};
    //           System.out.println(array[5]);

    //       } catch (ArrayIndexOutOfBoundsException e) {
    //           System.out.println("Exception poyman i nemnogo obrabotan");
    //          throw e;
    //      } finally {
    //           System.out.println("Eto block finally");
    //       }
    //  }
}



