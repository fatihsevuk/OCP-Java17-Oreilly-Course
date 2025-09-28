package com.fatihsevuk.java17.lesson20_streams;

import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Veli", "Ayşe");

        names.stream()
                .peek(n -> System.out.println("Before filter: " + n))
                .filter(n -> n.startsWith("A"))
                .peek(n -> System.out.println("After filter: " + n))
                .forEach(System.out::println);
    }

}
