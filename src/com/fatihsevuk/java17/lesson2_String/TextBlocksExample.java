package com.fatihsevuk.java17.lesson2_String;

public class TextBlocksExample {
    public static void main(String[] args) {
        String js = """
                let x = 10
                console.log(`value ${x}`)
                """;
        System.out.println(js + "//end");
    }
}
