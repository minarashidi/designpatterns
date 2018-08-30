package com.rashidi.practice.designpatterns.factory;

import com.rashidi.practice.designpatterns.factory.model.AdminUser;
import com.rashidi.practice.designpatterns.factory.model.RoleType;
import com.rashidi.practice.designpatterns.factory.model.StandardUser;
import com.rashidi.practice.designpatterns.factory.model.User;

public class UserFactory {

  public User createUser(RoleType type, String username) {
    if (RoleType.ADMIN == type) {
      return new AdminUser(username);
    } else if (RoleType.STANDARD == type) {
      return new StandardUser(username);
    }

    throw new RuntimeException("Invalid role type " + type);
  }
}
