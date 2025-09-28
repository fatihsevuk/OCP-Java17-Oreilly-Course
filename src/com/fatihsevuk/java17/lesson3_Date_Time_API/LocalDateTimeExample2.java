package com.fatihsevuk.java17.lesson3_Date_Time_API;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        // not possible
        //LocalTime lt = LocalTime.from(ld);

        System.out.println(ld.getYear());
        System.out.println(ld.get(ChronoField.YEAR));

        // not possible
        //System.out.println(ld.get(ChronoField.HOUR_OF_DAY));
        // UnsupportedTemporalTypeException

        System.out.println(ld.isSupported(ChronoField.HOUR_OF_DAY));
        System.out.println(ld.isSupported(ChronoField.YEAR));

        var ldt = ld.atTime(13,05);
        System.out.println(ldt);
        System.out.println(ldt.getClass().getName());

        var ld2 = LocalDate.of(2000,11,10);
        var res = ld2.adjustInto(ldt);

        System.out.println(res);
        System.out.println(res.getClass().getName());

        System.out.println(ld2.isLeapYear());

        Period thirty = Period.ofDays(30);
        LocalDate ld4 = LocalDate.of(2025,5,5);
        System.out.println(ld4);
        System.out.println(ld4.plus(thirty));

        Period oneMonth = Period.ofMonths(1);
        System.out.println(ld4);
        System.out.println(ld4.plus(oneMonth));



    }
}
