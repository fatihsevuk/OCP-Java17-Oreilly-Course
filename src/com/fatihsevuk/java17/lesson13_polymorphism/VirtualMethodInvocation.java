package com.fatihsevuk.java17.lesson13_polymorphism;

class Animal {
    void speak() {
        System.out.println("Animal speaking");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks..");
    }

    void fetch() {
        System.out.println("Dog fetching..");
    }
}


public class VirtualMethodInvocation {

    public static void main(String[] args) {

        Animal animal = new Dog();


        // Object Type (Run-Time Behavior)
        animal.speak();
        // 🐶 Prints "Dog barks" — because actual object is Dog
        //  At runtime, Java looks at the actual class of the object to decide which implementation to invoke.
        // "The type of the object referred to determines the behavior that results when invoked."
        // Even though a is of type Animal, the Dog's overridden version of speak() is invoked — this is dynamic dispatch.

        // Reference Type (Compile-Time Behavior)
        //animal.fetch();// Compile error: Animal doesn't declare `fetch`
        // "The type of the reference determines the directly accessible methods at compilation time."

    }

}
