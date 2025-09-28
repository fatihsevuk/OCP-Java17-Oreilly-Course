package com.fatihsevuk.java17.lesson17_collections;

import java.util.Arrays;

public class BinarSearch {
    public static void main(String[] args) {

        String [] names = {"Alice", "Bob", "Charlie","Denise","Frank","Eve","Grace","Heidi","Ivan"};
        System.out.println(Arrays.binarySearch(names, "Eve"));
    }
}
