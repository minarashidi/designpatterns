package com.rashidi.practice.designpatterns.strategy;

import com.rashidi.practice.designpatterns.strategy.model.Order;
import com.rashidi.practice.designpatterns.strategy.model.PayMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.EnumMap;

@Component
public final class PaymentContext implements ApplicationContextAware {

  private static final String BEAN_SUFFIX = "Strategy";
  private ApplicationContext context;

  private EnumMap<PayMethod, PaymentStrategy> strategies;

  public void pay(Order order) {
    strategies.get(order.getMethod()).pay(order.calculateTotalPrice());
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) {
    this.context = applicationContext;
  }

  @PostConstruct
  public void init() {
    this.strategies = new EnumMap<>(PayMethod.class);
    Arrays.stream(PayMethod.values())
      .forEach(payMethod -> strategies.put(payMethod, (PaymentStrategy) context.getBean(payMethod.getValue() + BEAN_SUFFIX)));
  }
}
