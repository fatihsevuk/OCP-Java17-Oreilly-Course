package com.fatihsevuk.java17.lesson12_Inheritance;

public class Paren1 {

    void doWork(String[] args) {}
}


class Child extends Paren1 {

    @Override
    void doWork(String... args) {}  // Valid override
}
