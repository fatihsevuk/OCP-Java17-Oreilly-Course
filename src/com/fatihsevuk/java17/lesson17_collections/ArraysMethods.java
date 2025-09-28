package com.fatihsevuk.java17.lesson17_collections;

import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {1, 2, 3, 7, 5};
        int [] arr3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.mismatch(arr1, arr2));
        System.out.println(Arrays.mismatch(arr1, arr3));

    }
}
