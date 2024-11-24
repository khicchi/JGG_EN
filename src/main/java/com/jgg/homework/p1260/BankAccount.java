package com.jgg.homework.p1260;

public class BankAccount {
  // Private instance fields
  private String accountNumber;
  private double balance;
  private String password;

  // Constructor to initialize accountNumber, balance, and password
  public BankAccount(String accountNumber, double balance, String password) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.password = password;
  }

  // Getter for accountNumber (read-only)
  public String getAccountNumber() {
    return accountNumber;
  }

  // Getter for balance (read-only)
  public double getBalance() {
    return balance;
  }

  // Setter for password (write-only)
  public void setPassword(String password) {
    this.password = password;
  }
}

