package com.fatihsevuk.java17.lesson15_enums;

 enum Color {
    RED, GREEN, BLUE;

    // Static initializer block
    static {
        System.out.println("Static initializer of enum class");
    }

    // Instance initializer block
    {
        System.out.println("Instance initializer for: " + this.name());
    }

    // Constructor
    Color() {
        System.out.println("Constructor for: " + this.name());
    }
}

enum Fruit {
    APPLE,
    BANANA;

    Fruit() {
        System.out.println("Constructor for: " + this.name());

        // 🔥 Dangerous: accessing another enum constant during construction
        //System.out.println("Comparing to BANANA: " + (this == BANANA));
    }
}

enum DayOfWeek {
     MONDAY("Back to Work"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY("Weekend tomorrow!"), SATURDAY, SUNDAY;

     //DayOfWeek() {} // Allow zero argument constructor.

    DayOfWeek(String message) {} // or with a String argument

    /*public DayOfWeek () {

    }*/

    DayOfWeek() {}
}

public class TryEnums {
    public static void main(String[] args) {
        Color color = Color.RED;
    }
}
