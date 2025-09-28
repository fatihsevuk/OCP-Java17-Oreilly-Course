package com.fatihsevuk.java17.lesson3_Date_Time_API;

import java.time.*;

public class TimeZoneExample2 {
    public static void main(String[] args) {
        var ld = LocalDate.of (2023, 1, 1);
        var lt = LocalTime.of(12, 0);
        var ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);

        var ldt2 = (LocalDateTime) LocalDate.of(2000, 1, 1).adjustInto(ldt);
        System.out .println(ldt2);
        System.out.println(ldt2.getClass().getName());

        var ldt3 = LocalDateTime.from(LocalDate.of(1900, 1, 1).adjustInto(ldt));


        var zdt = ZonedDateTime.of(ldt, ZoneId.of ("America/New_York" )) ;
        System.out.println(zdt);
        Instant instant = zdt.toInstant ();
        System.out.println(instant);

        var res2 = instant.adjustInto(zdt);
        System.out.println(res2);

        var zdt3 = ZonedDateTime.ofInstant(instant,ZoneId.of("Australia/Queensland"));
        System.out.println(zdt3);

        System.out.println(zdt.toInstant().equals(zdt.toInstant()));
    }
}
