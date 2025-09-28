package com.fatihsevuk.java17.lesson2_String;

public class StringIdentity {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        final String s3 = "He"; // Because s3 is declared as final, its value is known at compile time.
        String s4 = s3 + "llo";
        //s3 = "He" + "llo";

        System.out.println("s1 == s2? "+ (s1 == s2));
        System.out.println("s1 == s4? "+ (s1 == s4));




    }
}
