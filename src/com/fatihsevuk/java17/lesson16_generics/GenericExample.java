package com.fatihsevuk.java17.lesson16_generics;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Util {
    public static <T> T pick(T a, T b) {
        return a;
    }
}

public class GenericExample {
    public static void main(String[] args) {

        String s = Util.pick("hi", "there");     // T is inferred as String
        Integer i = Util.pick(1, 2);             // T is inferred as Integer
        Object o = Util.pick("hello", 10);       // T is inferred as Object
        var x = Util.pick(3, 2);
        var result = Util.pick("hi", 42);
        System.out.println(result);

        var result2 = Util.pick(new int[]{1}, new double[]{2.0});
        var sadsd =Util.pick(new int[]{}, new double[]{});
        Object Integer;
        var r = Util.pick(new LinkedList<String>(), new ArrayList<Integer>());

    }
}
