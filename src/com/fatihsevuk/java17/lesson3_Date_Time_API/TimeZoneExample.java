package com.fatihsevuk.java17.lesson3_Date_Time_API;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {
    public static void main(String[] args) {

//        ZoneId.getAvailableZoneIds()
//                .forEach(System.out::println);



        var zi = ZoneId.of("Europe/Paris");
        System.out.println(zi);

        /*ZoneId.of("Europe/Berlin")
                .getRules().getTransitions()
                .forEach(System.out::println);*/

        //System.out.println(zi.getRules().previousTransition(Instant.now()));
        System.out.println(zi.getRules().nextTransition(Instant.now()));

        var shiftTime = ZonedDateTime
                .parse("2025-10-26T00:00:00+02:00[Europe/Paris]");

        System.out.println(shiftTime);
        System.out.println(shiftTime.plusHours(24));
        System.out.println(shiftTime.plusHours(48));
        System.out.println(shiftTime.plusHours(72));





    }
}
