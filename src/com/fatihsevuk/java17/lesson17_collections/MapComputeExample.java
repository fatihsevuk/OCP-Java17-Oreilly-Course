package com.fatihsevuk.java17.lesson17_collections;

import java.util.HashMap;
import java.util.Map;

public class MapComputeExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);

        // Update existing
        map.compute("apple", (k, v) -> v == null ? 1 : v + 5);
        // apple=15

        // Key not present → inserts new
        map.compute("banana", (k, v) -> v == null ? 1 : v + 5);
        // banana=1

        // If null returned → removes entry
        map.compute("apple", (k, v) -> null);
        // apple removed

        map.computeIfAbsent("apple", k -> 45);

        map.computeIfPresent("apple", (k, v) -> v+10);


        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
