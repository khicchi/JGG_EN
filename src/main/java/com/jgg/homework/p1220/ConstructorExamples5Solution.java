package com.jgg.homework.p1220;

public class ConstructorExamples5Solution {

  public static void main(String[] args){

    // TASK-1: Create a class BankAccount that initializes with a double <balance> field.
    //         The balance should not be negative.
    //         If a negative balance is passed, set the balance to 0 and print an error message.
    //         Create a void <displayBalance> method which prints the balance

    // TASK-2: Create a BankAccount object with -100 <balance> // DEBUG
    BankAccount account1 = new BankAccount(-100); // Should print an error message and set balance to 0

    // TASK-3: Create another BankAccount object with 1000.50 balance
    BankAccount account2 = new BankAccount(1000.50);

    // TASK-4: <displayBalance> method for each object
    account1.displayBalance(); // Output: Balance: $0.0
    account2.displayBalance(); // Output: Balance: $1000.5

  }

}

class BankAccount {
  private double balance;

  // Constructor with validation
  public BankAccount(double balance) {
    if (balance < 0) {
      System.out.println("Error: Balance cannot be negative. Setting balance to 0.");
      this.balance = 0;
    } else {
      this.balance = balance;
    }
  }

  // Method to display balance
  public void displayBalance() {
    System.out.println("Balance: " + balance);
  }
}