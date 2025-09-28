package com.fatihsevuk.java17.lesson4_Flow_Control;

public class SwitchExpressionExamples {
    public static void main(String[] args) {

        int x = 1000;

        var res = switch (x) {
            case 0 -> "Zero";
            default -> throw new IllegalStateException("Unexpected value: " + x);
        };

        System.out.println(res);


    }
}
