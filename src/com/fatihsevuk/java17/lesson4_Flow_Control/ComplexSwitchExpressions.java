package com.fatihsevuk.java17.lesson4_Flow_Control;

import static java.lang.System.out;

public class ComplexSwitchExpressions {
    public static void main(String[] args) {
        int x = 0;
        int yield = 10 ;
        var res = switch (x) {
            case 0 -> {
                out.println("calculating for zero...");
                //return "Zero";
                // we can throw an exception inside block
                yield "Zero";
                // yield is not a java keyword , can be used as a variable name.
                // yield is a context-sensitive word in java
            }//;we cannot use here semicolon
            //case 1 -> yield "one"; yield not permitted here
            default -> throw new IllegalArgumentException("Bad Value");
        };

        out.println(res);


    }
}
