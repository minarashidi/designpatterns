package com.rashidi.practice.designpatterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CreditCardStrategy implements PaymentStrategy {
  private static final Logger logger = LoggerFactory.getLogger(CreditCardStrategy.class);

  public void pay(BigDecimal amount) {
    logger.info("amount {} paid using CreditCardStrategy", amount);
  }
}
