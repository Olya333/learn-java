package com.company.Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        LocalTime lt = LocalTime.of(16,40);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM,dd,yyyy");
        LocalDate date1 = LocalDate.parse("01,02,2015",f);
        LocalDate date2 = LocalDate.parse("01-02-2015");
        System.out.println(date2);

        System.out.println(date1);

      //  DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd,yyyy,hh:mm");
     //   System.out.println(ldt);
      //  System.out.println(ldt.format(f));

       // DateTimeFormatter d1  = DateTimeFormatter.ISO_LOCAL_DATE;
      //  System.out.println(ld);
      //  System.out.println(ld.format(d1));

      //  DateTimeFormatter d2  = DateTimeFormatter.ISO_LOCAL_TIME;
      //  System.out.println(lt);
      //  System.out.println(lt.format(d2));

      //  DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME ;
     //   System.out.println(ldt);
     //   System.out.println(ldt.format(d3));

      //  DateTimeFormatter d4  = DateTimeFormatter.ISO_WEEK_DATE;
      //  System.out.println(ld);
      //  System.out.println(ld.format(d4));

      //  DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
       // System.out.println(ld);
      //  System.out.println(ld.format(shortFormat));

       // System.out.println(ldt);
      //  System.out.println(ldt.format(shortFormat));

      //  System.out.println(lt);
     //   System.out.println(lt.format(shortFormat));



    }
}
