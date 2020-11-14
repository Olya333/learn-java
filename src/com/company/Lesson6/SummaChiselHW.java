package com.company.Lesson6;

public class SummaChiselHW {

    int sum() {
        int result = 0;
        System.out.println("Summa vsex chisel: " + result);
        return result;
    }

    int sum(int a) {
        int result = a;
        System.out.println("Summa vsex chisel: " + result);
        return result;
    }

    int sum(int b, int c) {
        int result = b + c;
        System.out.println("Summa vsex chisel: " + result);
        return result;
    }

    int sum(int d, int i, int f) {
        int result = d + i + f;
        System.out.println("Summa vsex chisel:" + result);
        return result;
    }

    int sum(int x, int y, int z, int j) {
        int result = x + y + z + j;
        System.out.println("Summa vsex chisel:" + result);
        return result;
    }

}

class SummaChiselHWTest {
    public static void main(String[] args) {
        SummaChiselHW s = new SummaChiselHW();

        s.sum();
        s.sum(3);
        s.sum(3, 4);
        s.sum(3, 4, 1);
        s.sum(3, 4, 1, 2);
    }
}
