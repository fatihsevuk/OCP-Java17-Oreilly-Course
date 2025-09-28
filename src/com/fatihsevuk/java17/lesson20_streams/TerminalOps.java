package com.fatihsevuk.java17.lesson20_streams;

import java.util.stream.IntStream;

public class TerminalOps {

    public static void main(String[] args) {
        var c = IntStream.range(0, 10)
                .peek(i -> System.out.println("processing item: "+ i))
                //.forEach(System.out::println)
                //.allMatch(x -> x < 4);
                .count()
        ;

        System.out.println(c);

    }


}
