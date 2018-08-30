package com.rashidi.practice.designpatterns.singleton;

public class UserService {

//  it's better to declare the obj volatile, consider when multiple threads try to access the instance
//  when the obj is being initialized in one thread, volatile immediately reflect the change in others threads.
//  so it reduces the overhead of calling the synchronized every time.
  private volatile static UserService obj;

  private UserService() {
  }

  public static UserService getInstance() {
    if (obj == null) {
//      To make it thread safe
      synchronized (UserService.class) {
        if (obj == null) {
          obj = new UserService();
        }
      }
    }
    return obj;
  }
}
