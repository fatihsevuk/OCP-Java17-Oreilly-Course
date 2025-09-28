package com.fatihsevuk.java17.lesson17_collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Insert
        queue.add("Alice");    // exception if full
        queue.offer("Bob");    // returns false if full

        // Examine
        System.out.println("Head (element): " + queue.element()); // exception if empty
        System.out.println("Head (peek): " + queue.peek());       // null if empty

        // Remove
        System.out.println("Removed (remove): " + queue.remove()); // exception if empty
        System.out.println("Removed (poll): " + queue.poll());     // null if empty

        // Check again
        System.out.println("Next head: " + queue.peek());
        System.out.println("Next head: " + queue.element());
    }
}
