package com.fatihsevuk.java17.lesson16_generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MisUseList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(/*LocalDate.now(),*/"John"));
        List<LocalDate> ld = new ArrayList<>(List.of(LocalDate.now(),LocalDate.now()));
        names.add("John");
        //names.add(LocalDate.of(1990, 1, 1));
        String n1 = names.get(0);
        //String n2 = (String) names.get(1);

    }
}
