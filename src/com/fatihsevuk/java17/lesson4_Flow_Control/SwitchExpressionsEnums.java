package com.fatihsevuk.java17.lesson4_Flow_Control;

import static java.lang.System.out;

enum Season {
    FALL,WINTER,SPRING,SUMMER
}

public class SwitchExpressionsEnums {
    public static void main(String[] args) {

        Season season = Season.SPRING;

        var season1 = switch (season) {
            case FALL -> "FALL";
            case SPRING -> "SPRING";
            case SUMMER -> "SUMMER";
            case WINTER -> "WINTER";
        };

        out.println(season1);
        out.println("-----------------------------");

        out.println("Season result is: "+ switch (season) {
            case FALL -> "FALL";
            case SPRING -> "SPRING";
            case SUMMER -> "SUMMER";
            case WINTER -> "WINTER";
        });

    }
}
