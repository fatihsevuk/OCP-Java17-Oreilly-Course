package com.fatihsevuk.java17.lesson20_streams;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.IntStream;

public class SpliteratorExample {
    public static void main(String[] args) {

        Spliterator.OfInt sp1 = IntStream.range(0, 1000).spliterator();

        sp1.tryAdvance((int x) -> System.out.println("sp1 before: " + x));

        // tryAdvance() only consumes one element at a time.

        var sp2 = sp1.trySplit();

        sp1.tryAdvance((int x) -> System.out.println("sp1 " + x));
        sp2.tryAdvance((int x) -> System.out.println("sp2 " + x));

        var sp3 = sp1.trySplit();
        var sp4 = sp2.trySplit();

        sp1.tryAdvance((int x) -> System.out.println("sp1 " + x));
        sp2.tryAdvance((int x) -> System.out.println("sp2 " + x));

        sp3.tryAdvance((int x) -> System.out.println("sp3 " + x));
        sp4.tryAdvance((int x) -> System.out.println("sp4 " + x));


    }
}
