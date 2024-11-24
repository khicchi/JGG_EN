package com.jgg.lessons.p2690;

  public class RunnerClass {
    public static void main(String[] args) {
      Order order = new Order();
      double finalPrice = order.calculateTotal(100.0, 0.1);
      System.out.println("Final Price after discount: $" + finalPrice);
    }
  }

  class Order {

    // Method to calculate order total with a discount
    public double calculateTotal(double price, double discountRate) {

      // Local Class defined inside calculateTotal() method
      class Discount {
        public double applyDiscount() {
          return price * (1 - discountRate);
        }
      }

      return new Discount().applyDiscount();
    }

  }