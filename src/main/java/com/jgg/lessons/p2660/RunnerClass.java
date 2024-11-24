package com.jgg.lessons.p2660;

  public class RunnerClass {

    public static void main(String[] args) {
      BankAccount account = new BankAccount("Alice", 1000);

      // Using the static nested class for currency conversion
      double amountInEuro = BankAccount.CurrencyConverter.toEuro(account.getBalance());
      System.out.printf("Balance in EUR: €%.2f%n", amountInEuro);

      double amountInPound = account.balanceAsGbp();
      System.out.printf("Balance in GBP: £%.2f%n", amountInPound);
    }
  }
