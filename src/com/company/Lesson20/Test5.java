package com.company.Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("hello"));
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println(list.indexOf(new String("poka")));
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("poka"));
        System.out.println(list.toString());

    }
}
