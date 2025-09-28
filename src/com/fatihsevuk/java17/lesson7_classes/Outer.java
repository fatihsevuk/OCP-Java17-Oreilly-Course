package com.fatihsevuk.java17.lesson7_classes;

public class Outer {
    int x = 10;

    class Inner {
        int x = 20;

        void printX(int x) {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printX(30);
    }
}