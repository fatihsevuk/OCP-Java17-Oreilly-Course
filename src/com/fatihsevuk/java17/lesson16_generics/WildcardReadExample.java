package com.fatihsevuk.java17.lesson16_generics;

import java.util.List;
import java.util.ArrayList;

public class WildcardReadExample {

    // Method that only reads from the list
    public static void doStuffLC(List<? extends CharSequence> lc) {
        for (CharSequence cs : lc) {
            System.out.println("Length: " + cs.length());
        }

        // Uncommenting the line below will cause a compile error:
        //lc.add(new StringBuilder("Oops")); // ❌ Can't add to ? extends
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        List<StringBuilder> builders = new ArrayList<>();
        builders.add(new StringBuilder("Java"));
        builders.add(new StringBuilder("Wildcard"));

        System.out.println("From List<String>:");
        doStuffLC(strings);  // ✅ Works

        System.out.println("\nFrom List<StringBuilder>:");
        doStuffLC(builders); // ✅ Works
    }
}