package com.fatihsevuk.java17.lesson7_classes.localclassses;

abstract class MyRunnable2 implements Runnable {
    String message;
    MyRunnable2(String s) {message = s;}
}

public class MyTask2 {
    public static void main(String[] args) {
        MyRunnable2 r = new MyRunnable2("Aloha!") {
            @Override
            public void run() {
                System.out.println("subclass of MyRunnable2 , message is :"+ message);
            }
        };

        r.run();
    }
}
