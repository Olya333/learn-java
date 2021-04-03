package com.company.Lesson27;

public class Test2 {
    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int array[] = {1, 4, 0};
        if (2 >= 0 && 2 < array.length) {
            System.out.println(array[2]);
        }
    }
}
