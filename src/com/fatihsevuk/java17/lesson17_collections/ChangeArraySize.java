package com.fatihsevuk.java17.lesson17_collections;

import java.util.Arrays;

public class ChangeArraySize {
    public static void main(String[] args) {

        int [] oldArray = {1,2,3,4,5};
        int [] newArray = new int[10];

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        System.out.println(Arrays.toString(newArray));

        int [] newArray2 = Arrays.copyOf(oldArray, 20);
        System.out.println(Arrays.toString(newArray2));





    }
}
