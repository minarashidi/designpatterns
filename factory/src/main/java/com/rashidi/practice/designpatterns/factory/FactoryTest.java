package com.rashidi.practice.designpatterns.factory;

import com.rashidi.practice.designpatterns.factory.model.RoleType;
import com.rashidi.practice.designpatterns.factory.model.User;

public class FactoryTest {

  public static void main(String[] args) {

    UserFactory userFactory = new UserFactory();

    User user = userFactory.createUser(RoleType.ADMIN, "admin");
    System.out.println("admin user:" + user.getUsername());

    user = userFactory.createUser(RoleType.STANDARD, "standard");
    System.out.println("standard user:" + user.getUsername());
  }
}
