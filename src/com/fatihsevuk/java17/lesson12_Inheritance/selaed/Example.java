package com.fatihsevuk.java17.lesson12_Inheritance.selaed;

sealed interface Vehicle permits Car,Truck,Bicycle {
    default void add(String item) {
        System.out.println("Adding " +item+ " to " + this);
    }
}

final class  Car implements Vehicle {
    private int seats;

    public Car (int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{"+"seats=" + seats + '}';
    }
}

non-sealed class Truck implements Vehicle /*permits SemiTruck*/ {
    private int payload;

    public Truck (int payload) {
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {

    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}

final class Bicycle implements Vehicle  {

}

/*final class SemiTruck extends Truck {

    public SemiTruck(int payload) {
        super(payload);
    }
}*/


public class Example {

    public static boolean canCarry(Vehicle vehicle , int weight) {
        boolean ok = true;

        if (vehicle instanceof Truck t) {
            ok = t.getPayload() >= weight;
        } else if (vehicle instanceof Car c) {
            ok = (c.getSeats() -1) * 170 >= weight;
        } else if (vehicle instanceof Bicycle b) {
            ok = false;
        }
        return ok;
    }

    public static void main(String[] args) {

        System.out.println("10_000 lb truck can carry 20_000lb? "
                + canCarry (new Truck(10_000), 20_000)) ;
        System.out.println("10_000 lb truck can carry 2_000lb? "
                + canCarry (new Truck(10_000), 2_000));
        System.out.println("five seat car can carry 2_0001b? "
                + canCarry (new Car (5), 2_000));
        System.out.println("bicycle car can carry 2_0001b? "
                + canCarry (new Bicycle (), 2_000));

    }
}
