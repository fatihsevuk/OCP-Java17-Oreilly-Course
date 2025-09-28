package com.fatihsevuk.java17.lesson17_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D", "F", "G"));

        System.out.println("Before retainAll: " + list1);

        // Retain only elements that are also in list2
        list1.retainAll(list2);

        System.out.println("After retainAll: " + list1);
    }
}
