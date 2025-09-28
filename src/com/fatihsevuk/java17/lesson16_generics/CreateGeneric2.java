package com.fatihsevuk.java17.lesson16_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Container<E> {
    private List<E> items;

    public Container(List<E> items) {
        this.items = items;
    }

    public <F> Container<F> map(Function<E, F> op) {
        List<F> res = new ArrayList<>();
        for (E e : items) res.add(op.apply(e));
        return new Container<>(res);
    }

    public void printItems() {
        for (E item : items) {
            System.out.println(item);
        }
    }
}

public class CreateGeneric2 {
    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>(List.of(1,2,3));
        Container<String> stringContainer = integerContainer.map(integer -> "Item " + integer);
        stringContainer.printItems();
    }
}
