package com.company.Lesson20;
import java.util.Map;
import java.util.HashMap;

public class Test11 {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>();
        map.put(777,"Ivanov Mihail");
        map.put(778,"Tregulov Zaur");
        map.put(779,"Sidorova Mariya");
        map.put(780,"Petrov Petr");
        map.put(779,"Poberto Karlos");
        map.put(781,"Tregulov Zaur");
        map.remove(779);
        System.out.println("map = "+ map);
    }
}
