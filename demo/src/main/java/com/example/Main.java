package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world let's try some sealed intefaces with records!");
        Person emp = new Employee("Alice", 30, "Developer");
        Person cust = new Customer("Bob", 25, "Acme Corp");

        printPersonInfo(emp);
        printPersonInfo(cust);
    }

    static void printPersonInfo(Person person) {
        switch (person) {
            case Employee e -> System.out.println("Employee Position: " + e.position());
            case Customer c -> System.out.println("Customer Company: " + c.company());
        }
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Is Adult: " + person.isAdult());
    }
}