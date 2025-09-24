package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world let's try some records!");
        Person person = new Person("Alice", 30);
        System.out.println("Person: " + person);
        System.out.println("Is adult: " + person.isAdult());

        // person.name = "Bob";
        // This line would cause a compilation error because records are immutable
        // what we can do is create a new instance:

        Person child = new Person("Bob", 15);
        System.out.println("Child: " + child);
    }
}