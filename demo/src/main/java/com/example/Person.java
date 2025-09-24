package com.example;

sealed interface Person permits Employee, Customer {
  String name();

  int age();

  default boolean isAdult() {
    return age() >= 18;
  }
}
