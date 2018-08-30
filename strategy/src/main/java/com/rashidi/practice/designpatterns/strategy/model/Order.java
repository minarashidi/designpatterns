package com.rashidi.practice.designpatterns.strategy.model;

import java.math.BigDecimal;
import java.util.List;

public class Order {

  private final List<Item> items;
  private final PayMethod method;


  public Order(List<Item> items, PayMethod method) {
    this.items = items;
    this.method = method;
  }

  public List<Item> getItems() {
    return items;
  }

  public PayMethod getMethod() {
    return method;
  }

  public BigDecimal calculateTotalPrice() {
    return items.stream().map(Item::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add).setScale(2, BigDecimal.ROUND_CEILING);
  }
}
