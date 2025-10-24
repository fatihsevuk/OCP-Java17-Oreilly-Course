package com.fatihsevuk.java17.lesson20_streams;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {

/*        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(1, (a, b) -> a + b);

        System.out.println(sum);  // Output: 15*/

        List<String> words = List.of("Java", "Stream", "Reduce");

        int totalLength = words.stream()
                .reduce(0,
                        (sum, word) -> sum + word.length(),  // accumulator
                        Integer::sum);                      // combiner

        System.out.println(totalLength);  // Output: 14


    }
}


