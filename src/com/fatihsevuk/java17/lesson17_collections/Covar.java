package com.fatihsevuk.java17.lesson17_collections;

import java.time.LocalDate;
import java.util.Arrays;

public class Covar {

    static void addToArray(Object [] oa) {
        oa[oa.length-1] = LocalDate.now();
    }

    public static void main(String[] args) {
        String [] sa = new String[4];
        addToArray(sa);
    }

}
