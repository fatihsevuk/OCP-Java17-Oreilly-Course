package com.fatihsevuk.java17.lesson11_local_variable_declaration;

import java.lang.constant.ConstantDesc;

public class VarExamples {

    public static void main(String[] args) {

        // var x = {1,2,3}; // type of array is not unambiguous

        //var x = new int[]{1, 2, 3};

        // var [] y = new int[] {1,2,3};

        //var a1=1,b1=3;

        String s = "Hello";

        Integer i = 99;

        //Object result = true ? s: i;
        //Comparable result = true ? s: i;

        //ConstantDesc res = true ? s :i;

        var res = true ? s :i;

        res.compareTo(null);


        int x = 99;

        var res2 = switch (x) {
            case 99 -> s;
            default -> i;
        };






    }
}
