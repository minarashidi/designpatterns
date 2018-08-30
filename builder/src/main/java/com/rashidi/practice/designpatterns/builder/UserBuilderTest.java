package com.rashidi.practice.designpatterns.builder;

public class UserBuilderTest {

  public static void main(String[] args) {
    User user = new User.UserBuilder("Mina", "Rashidi")
      .age(29)
      .address("Dellensvagen 14")
      .build();
    System.out.println(user);
  }
}
