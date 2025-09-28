package com.fatihsevuk.java17.lesson7_classes.localclassses;


class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from MyRunnable");
    }
}

public class MyTask {

    public static void main(String[] args) {
        // Runnable r = new MyRunnable();

        // Runnable r = () -> System.out.println("Hello from MyRunnable");

        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello from MyRunnable");
            }
        };

        r.run();
    }
}
