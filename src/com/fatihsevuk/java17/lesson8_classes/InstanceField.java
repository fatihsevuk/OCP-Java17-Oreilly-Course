package com.fatihsevuk.java17.lesson8_classes;


class Parent {
    public int x = 100;
}

public class InstanceField extends Parent {

    int x = 200;

    public void go() {
        System.out.println("InstanceField's version of x is "+ x);
        System.out.println("Parent's version of x is "+ super.x);
        Parent p = this;
        System.out.println("p.x gives "+ p.x);
    }

    public static void main(String[] args) {
        InstanceField instanceField = new InstanceField();
        instanceField.go();
    }
}
