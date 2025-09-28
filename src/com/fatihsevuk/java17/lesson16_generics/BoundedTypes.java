package com.fatihsevuk.java17.lesson16_generics;

class C1 {}
interface I1 {}
interface I2 {}
interface I3 {}

class B<E extends C1 & I1 & I2 & I3> {}

class C<E extends C1 , I1 , I2 , I3> {}


public class BoundedTypes {
}
