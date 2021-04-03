package com.company.Lesson27;

import java.io.File;
import java.io.FileInputStream;
public class Test3 {
    public static void main(String[] args) throws Exception{
        File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("File nayden");
        fis.read();
       // FileOutputStream fos = new FileOutputStream(f);
      //  fos.write(100);
    }
}
