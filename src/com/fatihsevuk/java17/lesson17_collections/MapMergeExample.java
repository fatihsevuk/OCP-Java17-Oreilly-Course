package com.fatihsevuk.java17.lesson17_collections;
import java.util.HashMap;
import java.util.Map;

public class MapMergeExample {
    public static void main(String[] args) {
        Map<String, Integer> sales = new HashMap<>();
        sales.put("Apple", 50);
        sales.put("Banana", 30);

        // Case 1: Key not present → adds entry
        sales.merge("Cherry", 20, (oldVal, newVal) -> oldVal + newVal);
        // Map: {Apple=50, Banana=30, Cherry=20}

        // Case 2: Key exists → update value using remappingFunction
        sales.merge("Apple", 15, (oldVal, newVal) -> oldVal + newVal);
        // Apple = 50 + 15 → 65

        // Case 3: If remappingFunction returns null → remove entry
        sales.merge("Banana", 10, (oldVal, newVal) -> null);
        // Banana removed

        // Print final result
        sales.forEach((fruit, amount) ->
                System.out.println(fruit + " -> " + amount));
    }
}
