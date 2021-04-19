package com.company.Lesson28;

import java.time.LocalDateTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {
        // LocalDate ld1 = LocalDate.of(2021, 4, 6);
        // System.out.println(ld1);
        // ld1 = ld1.plusWeeks(3);
        //System.out.println(ld1);

        // LocalTime lt1 = LocalTime.of(15, 30);
        //lt1 = lt1.plusHours(1).minusMinutes(10).plusSeconds(18).minusNanos(5);
        // lt1 = lt1.minusMinutes(10);
        // lt1 = lt1.plusSeconds(18);
        //  lt1 = lt1.minusNanos(5);
        // System.out.println(lt1);
        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.SEPTEMBER, 10, 17, 25);
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(30);
        System.out.println(ldt1);

    }
}
