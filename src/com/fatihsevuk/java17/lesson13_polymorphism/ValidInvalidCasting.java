package com.fatihsevuk.java17.lesson13_polymorphism;


import java.util.ArrayList;

public class ValidInvalidCasting {
    public static void main(String[] args) {
        ArrayList al= null;
        Runnable rn = (Runnable) al;

        Runnable r = null;
        ArrayList al2= (ArrayList) r;

        String sl = null;
    //    rn = (Runnable) sl;

        Runnable r2 = null;
   //     String sl2 = (String) r2;


    }


}
