package com.fatihsevuk.java17.lesson10_scope_accessibility.package1;

import com.fatihsevuk.java17.lesson10_scope_accessibility.package2.P1;

public class Q1 extends P1 {
    void show(P1 p) {
        System.out.println(x);
    }
}
