package com.company.Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
       // for (int i = 0; i < list.size(); i++) {
       //     System.out.println(list.get(i));
      //  }
       // list.set(1,"!!!");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(1,list2);
        list2.set(1,"Ivanov");

        for (String s : list) {
            System.out.print(s + " ");
        }
        //list.clear();
        //System.out.println();
      //  System.out.println();
       // System.out.println();
       // for (String s : list) {
       //     System.out.print(s + " ");
      //  }

    }
}
