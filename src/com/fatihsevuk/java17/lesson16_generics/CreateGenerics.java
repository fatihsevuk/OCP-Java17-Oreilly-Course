package com.fatihsevuk.java17.lesson16_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    Box(T content) {
        this.content = content;
    }

    public <U> void printWith(T otherContent, U extra) {
        System.out.println("This Box has: " + content);
        System.out.println("Other Content of same type T: " + otherContent);
        System.out.println("Extra of type U: " + extra);
    }

     public static <T, X> void processBox(T item, X extra) {
         System.out.println("Processing item of type T: " + item);
         System.out.println("Processing extra of type X: " + extra);
     }


}

public class CreateGenerics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        String value = stringBox.get();
        stringBox.printWith("Generics",25);

        Box<Integer> integerBox = new Box<>(23);
        var i = integerBox.get();

    }
}


