package com.fatihsevuk.java17.lesson14_interfaces;


interface A{
    default void doStuff(int x){}
}

interface B extends A{
    void doStuff(int y);
}

class X implements A{}

//class Y implements B{}




public class TryInterfaces {
}
