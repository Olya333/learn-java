package com.company.Lesson20HomeWork;

import java.util.*;

public class Test1 {
    public ArrayList <String> abc(String...s){
        ArrayList <String> aL = new ArrayList<>();
        for(String s1 : s){
            if(!aL.contains(s1)){
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc("privet","ok","poka","privet","kak dela?","ok","hello");
    }
}
