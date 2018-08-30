package com.rashidi.practice.designpatterns.strategy;

import com.rashidi.practice.designpatterns.strategy.model.Item;
import com.rashidi.practice.designpatterns.strategy.model.Order;
import com.rashidi.practice.designpatterns.strategy.model.PayMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrategyTest {

  public static void main(String[] args) {
    ApplicationContext springContext = new AnnotationConfigApplicationContext("com.rashidi.practice.designpatterns.strategy");
    PaymentContext paymentContext = springContext.getBean(PaymentContext.class);

    List<Item> items = Arrays.asList(new Item(new BigDecimal(10.23), "Item #1"),
      new Item(new BigDecimal(20.14), "Item #2"));
    Order orderWithCreditCard = new Order(items, PayMethod.CREDIT_CARD);

    items = Arrays.asList(new Item(new BigDecimal(50.22), "Item #5"),
      new Item(new BigDecimal(60.11), "Item #6"));
    Order orderWithPayPal = new Order(items, PayMethod.PAYPAL);

    Stream.of(orderWithCreditCard, orderWithPayPal).forEach(paymentContext::pay);

  }
}
