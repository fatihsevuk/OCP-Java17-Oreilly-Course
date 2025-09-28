package com.fatihsevuk.java17.lesson17_collections;

import java.util.*;

class Person implements Comparable<Person> {
    String name;

    Person(String n) {
        this.name = n;
    }

    // Uncomment to FIX HashSet issues
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return Objects.equals(this.name, other.name);
    }

//    // Uncomment to FIX TreeSet issues
   @Override
   public String toString() {
       return name;
   }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

public class SetDemo {
    public static void main(String[] args) {
        // ---------- HASHSET DEMO ----------
        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");

        hashSet.add(p1);
        hashSet.add(p2);

        System.out.println("HashSet size (without equals/hashCode): " + hashSet.size()); // ❌ 2

        // ---------- TREESET DEMO ----------
        try {
            TreeSet<Person> treeSet = new TreeSet<>(); // requires Comparable or Comparator
            treeSet.add(new Person("Bob")); // ❌ ClassCastException at runtime
            treeSet.add(new Person("Fatioh")); // ❌ ClassCastException at runtime
            treeSet.add(new Person("Alice")); // ❌ ClassCastException at runtime
            System.out.println("TreeSet contents (with natural ordering): " + treeSet);

        } catch (Exception e) {
            System.out.println("TreeSet error (no Comparable/Comparator): " + e);
        }

        // ---------- FIXED VERSIONS ----------
        HashSet<Person> fixedHashSet = new HashSet<>();
        Person p3 = new Person("Charlie");
        Person p4 = new Person("Charlie");

        // if equals() and hashCode() are uncommented
        fixedHashSet.add(p3);
        fixedHashSet.add(p4);
        System.out.println("HashSet size (with equals/hashCode): " + fixedHashSet.size()); // ✅ 1

        TreeSet<String> fixedTreeSet = new TreeSet<>(); // Using built-in Comparable
        fixedTreeSet.add("Banana");
        fixedTreeSet.add("Apple");
        fixedTreeSet.add("Cherry");
        System.out.println("TreeSet contents (with natural ordering): " + fixedTreeSet);
    }
}

