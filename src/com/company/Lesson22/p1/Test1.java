package com.company.Lesson22.p1;
import com.company.Lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVes());
        System.out.println(c.getVozrast());

    }

}
