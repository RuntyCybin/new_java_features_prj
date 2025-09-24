package com.example;

public record Employee(String name, int age, String position) implements Person {
  @Override
  public boolean isAdult() {
    // Custom logic for Employee
    return age() >= 18; // For example, consider adult if age is 18 or older
  }
}
