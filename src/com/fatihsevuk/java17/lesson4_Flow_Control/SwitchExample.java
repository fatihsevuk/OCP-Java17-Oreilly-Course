package com.fatihsevuk.java17.lesson4_Flow_Control;

public class SwitchExample {
    public static void main(String[] args) {
        int x=99;

        /*switch (x) {
            case 99:
                System.out.println("ninety-nine");
            case 100:
                System.out.println("one hundred");
            default:
                System.out.println("other");
        }*/

        switch (x) {
            case 99 -> {
                System.out.println("ninety-nine");
                int y = 200;
            }
            case 100 -> System.out.println("one hundred");
            default -> System.out.println("other");
        }

    }


}
