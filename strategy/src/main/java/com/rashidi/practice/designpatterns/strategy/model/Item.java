package com.rashidi.practice.designpatterns.strategy.model;

import java.math.BigDecimal;

public class Item {

  private final BigDecimal price;
  private final String name;

  public Item(BigDecimal price, String name) {
    this.price = price;
    this.name = name;
  }

  BigDecimal getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
