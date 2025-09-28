package com.fatihsevuk.java17.lesson18_comparison;

import java.text.Collator;
import java.util.*;

public class LocalExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ångström", "apple", "zebra", "Banana", "cherry");

        // Locale: Swedish
        Collator collator = Collator.getInstance(new Locale("sv", "SE"));
        words.sort(collator);

        //Collections.sort(words);
        System.out.println(words);
    }
}
