package com.jgg.lessons.p2660;

import lombok.AllArgsConstructor;
import lombok.Getter;

  @AllArgsConstructor
  @Getter
  public class BankAccount {
    private String accountHolder;
    private double balance;

    public double balanceAsGbp() {
      return CurrencyConverter.toEuro(balance);
    }

    public static class CurrencyConverter {

      private static final double USD_TO_EUR = 0.95;
      private static final double USD_TO_GBP = 0.82;

      public static double toEuro(double amount) {
        return amount * USD_TO_EUR;
      }

      public static double toPound(double amount) {
        return amount * USD_TO_GBP;
      }

    }
  }
