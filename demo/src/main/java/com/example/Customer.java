package com.example;

public record Customer(String name, int age, String company) implements Person {
  @Override
  public boolean isAdult() {
    // Custom logic for Customer
    return age() >= 21; // For example, consider adult if age is 21 or older
  }
}
