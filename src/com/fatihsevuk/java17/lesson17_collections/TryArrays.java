package com.fatihsevuk.java17.lesson17_collections;

import java.util.Arrays;
import java.util.List;

public class TryArrays {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);

        list.set(0, "X");  // ✅ Changes arr[0] too

        System.out.println("List: " + list);        // [X, B, C]
        System.out.println("Array: " + Arrays.toString(arr)); // [X, B, C]

        list.add("D"); // ❌ Throws UnsupportedOperationException
    }
}
