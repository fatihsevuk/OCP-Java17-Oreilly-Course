package com.fatihsevuk.java17.lesson3_Date_Time_API;

import java.time.*;
import java.time.temporal.ChronoField;

public class DateTimeExample {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println(i1);

        //ZonedDateTime zdt = ZonedDateTime.ofInstant(i1, ZoneId.of("Europe/Istanbul"));
        //System.out.println(zdt);

        LocalDateTime ldt = LocalDateTime.now();// there is no time zone info
        System.out.println(ldt);

        Duration dur = Duration.ofMinutes(340);
        System.out.println(dur);

        Period per = Period.of(1,14,540);
        System.out.println(per);
        System.out.println(per.normalized());


        LocalDate ld = LocalDate.of(2065,4,13);
        System.out.println(ld);

        System.out.println(ld.getMonth());

        LocalDate ld2= ld.plusDays(10);
        System.out.println(ld2);

        System.out.println(ld.with(ChronoField.MONTH_OF_YEAR,7));
        System.out.println(ld);

        var ld3 = LocalDate.parse("2000-07-14");
        System.out.println(ld3);

        LocalDateTime ldt2 = LocalDateTime.now();
        LocalDate ld4 = LocalDate.from(ldt2);

        System.out.println(ldt2);
        System.out.println(ld4);


    }
}
