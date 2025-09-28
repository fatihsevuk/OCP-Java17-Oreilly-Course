package com.fatihsevuk.java17.lesson10_scope_accessibility;

class P {
    // int x = 99; // can be default
    // public int x = 99; // can be public
    protected int x = 99; // can be protected
}

public class Q extends P {
    void show(P p) {
        System.out.println(x);
    }
}
