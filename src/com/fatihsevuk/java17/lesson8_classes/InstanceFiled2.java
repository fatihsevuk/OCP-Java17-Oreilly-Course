package com.fatihsevuk.java17.lesson8_classes;


interface Parent2 {
    public int x = 100;
}

public class InstanceFiled2 implements Parent2 {

    int x = 200;

    public void go() {
/*        System.out.println("InstanceField's version of x is "+ x);
        System.out.println("Parent's version of x is "+ super.x);//super not valid for interfaces
        Parent p = this;
        System.out.println("p.x gives "+ p.x);*/
    }

    public static void main(String[] args) {
        InstanceField instanceField = new InstanceField();
        instanceField.go();
    }
}
